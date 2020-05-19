package com.example.TaxiApp.Service;

import com.example.TaxiApp.DTO.Customer.CustomerDto;
import com.example.TaxiApp.Entity.Customer;

public interface CustomerService {
    CustomerDto save(Customer customer);
}
