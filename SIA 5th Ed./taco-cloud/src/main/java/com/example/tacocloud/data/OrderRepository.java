package com.example.tacocloud.data;

import com.example.tacocloud.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Order,Long> {
    List<Order> findByZip(String zip);
}
