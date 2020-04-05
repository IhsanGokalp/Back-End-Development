package com.Midterm.Exam.Dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class CustomersDao {
    private boolean noCustomers;
    private List<CustomerReturnDao> customerReturnDaos;

    public CustomersDao(boolean noCustomers, List<CustomerReturnDao> customerReturnDaos) {
        this.noCustomers = noCustomers;
        this.customerReturnDaos = customerReturnDaos;
    }
}
