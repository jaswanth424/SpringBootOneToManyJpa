package com.jk.jpa.oneToMany.repository;

import com.jk.jpa.oneToMany.dto.OrderResponse;
import com.jk.jpa.oneToMany.model.Customer;
import org.aspectj.weaver.ast.Literal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.jk.jpa.oneToMany.dto.OrderResponse (c.name, p.name) from Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
