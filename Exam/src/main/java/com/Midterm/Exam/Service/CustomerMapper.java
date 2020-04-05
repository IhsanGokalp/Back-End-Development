package com.Midterm.Exam.Service;

import com.Midterm.Exam.Dao.CustomerCreateDao;
import com.Midterm.Exam.Dao.CustomerReturnDao;
import com.Midterm.Exam.Entity.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerMapper {
    public CustomerReturnDao toCustomerReturnDto(Customer customer) {
        CustomerReturnDao customerReturnDto = new CustomerReturnDao();
        customerReturnDto.setCity(customer.getCity());
        customerReturnDto.setEmailAddress(customer.getEmailAddress());
        customerReturnDto.setFirstName(customer.getFirstName());
        customerReturnDto.setJobTitle(customer.getJobTitle());
        customerReturnDto.setId(customer.getId());
        customerReturnDto.setMobilePhone(customer.getMobilePhone());
        customerReturnDto.setLastName(customer.getLastName());
        customerReturnDto.setWebPage(customer.getWebPage());
        return customerReturnDto;
    }
    public Customer toCustomer(CustomerCreateDao customerCreateDao) {
        Customer customer = new Customer();
        customer.setCity(customerCreateDao.getCity());
        customer.setEmailAddress(customerCreateDao.getEmailAddress());
        customer.setFirstName(customerCreateDao.getFirstName());
        customer.setJobTitle(customerCreateDao.getJobTitle());
        customer.setLastName(customerCreateDao.getLastName());
        customer.setMobilePhone(customerCreateDao.getMobilePhone());
        customer.setWebPage(customerCreateDao.getWebPage());
        return customer;
    }
}
