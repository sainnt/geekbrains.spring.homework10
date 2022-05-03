package com.sainnt.geekbrains.homework10.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Product extends Entity {
    private String name;
    private long price;

    public Product() {
    }

    public Product(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public Product(Long id, String name, long price) {
        super(id);
        this.name = name;
        this.price = price;
    }
}
