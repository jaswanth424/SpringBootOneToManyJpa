package com.jk.jpa.oneToMany.repository;

import com.jk.jpa.oneToMany.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
