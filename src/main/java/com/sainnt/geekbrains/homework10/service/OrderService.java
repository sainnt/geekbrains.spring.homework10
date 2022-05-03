package com.sainnt.geekbrains.homework10.service;

import com.sainnt.geekbrains.homework10.dto.CreateOrderDto;
import com.sainnt.geekbrains.homework10.entity.Order;


public interface OrderService extends CRUDService<Order> {
    Order createOrder(CreateOrderDto createOrderDto);

}
