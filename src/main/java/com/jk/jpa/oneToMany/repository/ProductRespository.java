package com.jk.jpa.oneToMany.repository;

import com.jk.jpa.oneToMany.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRespository extends JpaRepository<Product, Integer> {
}
