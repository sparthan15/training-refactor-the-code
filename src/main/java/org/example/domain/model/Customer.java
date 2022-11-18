package org.example.domain.model;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Customer {
    String id;
    private String name;
    private String lastName;
    private BigDecimal money;
}
