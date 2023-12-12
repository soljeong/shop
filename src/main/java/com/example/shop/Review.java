package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Review {
    @Id
    private Long id;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Product product;
    private Integer rating;
    private String review;
}
