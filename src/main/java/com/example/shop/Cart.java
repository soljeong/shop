package com.example.shop;


import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Cart {
    @Id
    private Long id;
    @ManyToOne
    private Customer customer;
    @OneToMany
    private List<Product> products;
    private Date purchaseDate;
}