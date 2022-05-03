package com.sainnt.geekbrains.homework10.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class Order extends Entity {
    private User user;
    private List<OrderItem> orderItemList;

    public long getTotalPrice() {
        return orderItemList.stream()
                .map(orderItem -> orderItem.getProductPrice() * orderItem.getAmount())
                .reduce(0L, Long::sum);
    }
}
