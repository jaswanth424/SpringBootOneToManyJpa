package com.jk.jpa.oneToMany.controller;


import com.jk.jpa.oneToMany.model.Customer;
import com.jk.jpa.oneToMany.repository.CustomerRepository;
import com.jk.jpa.oneToMany.repository.ProductRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRespository productRespository;

    @PostMapping("/placeOrder")
    public Customer placeOrder(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
