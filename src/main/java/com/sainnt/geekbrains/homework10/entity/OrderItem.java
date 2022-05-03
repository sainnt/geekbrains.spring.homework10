package com.sainnt.geekbrains.homework10.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem extends Entity {
    private Order order;
    private Product product;
    private int amount;
    private long productPrice;
}
