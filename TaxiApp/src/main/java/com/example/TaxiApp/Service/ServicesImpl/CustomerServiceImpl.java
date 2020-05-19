package com.example.TaxiApp.Service.ServicesImpl;

import com.example.TaxiApp.DTO.Customer.CustomerDto;
import com.example.TaxiApp.Entity.Customer;
import com.example.TaxiApp.Mapper.CustomerMapper;
import com.example.TaxiApp.Repository.CustomerRepository;
import com.example.TaxiApp.Service.CustomerService;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private CustomerMapper customerMapper;

    @Override
    public CustomerDto save(Customer customer) {
        return customerMapper.toCustomerDto(customerRepository.save(customer));
    }
}
