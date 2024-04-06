package com.jk.jpa.oneToMany.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;
    private String name;
    private String city;

    @OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_product_FK", referencedColumnName = "customer_id")
    private List<Product> products;
}
