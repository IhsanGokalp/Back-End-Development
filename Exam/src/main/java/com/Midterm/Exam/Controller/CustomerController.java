package com.Midterm.Exam.Controller;

import com.Midterm.Exam.Dao.CustomerCreateDao;
import com.Midterm.Exam.Dao.CustomersDao;
import com.Midterm.Exam.Entity.Customer;
import com.Midterm.Exam.Service.CustomerService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    private CustomersDao listCustomers() {
        System.out.println("there");
        CustomersDao customersDao =
                new CustomersDao(customerService.findAll().isEmpty(), customerService.findAll());
        return customersDao;
    }

    @PostMapping("/newCustomer")
    private Customer save(@RequestBody CustomerCreateDao customerCreateDto) {
        System.out.println("here");
        return customerService.save(customerCreateDto);
    }
}
