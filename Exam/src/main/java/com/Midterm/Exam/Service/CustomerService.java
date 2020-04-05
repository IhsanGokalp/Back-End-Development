package com.Midterm.Exam.Service;

import com.Midterm.Exam.Dao.CustomerCreateDao;
import com.Midterm.Exam.Dao.CustomerReturnDao;
import com.Midterm.Exam.Entity.Customer;
import com.Midterm.Exam.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerReturnDao> findAll() {
        return customerRepository.findAll()
                .stream()
                .map(customerMapper::toCustomerReturnDto)
                .collect(Collectors.toList());
    }

    public Customer save(CustomerCreateDao customerCreateDto) {
        return customerRepository.save(customerMapper.toCustomer(customerCreateDto));
    }
}
