package com.sainnt.geekbrains.homework10.dto;

import lombok.Data;

import java.util.List;

@Data
public class CreateOrderDto {
    private long userId;
    private List<OrderItemDto> items;
}
