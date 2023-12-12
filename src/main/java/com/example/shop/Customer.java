package com.example.shop;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Customer {
    @Id
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
    private Integer points;
    
}