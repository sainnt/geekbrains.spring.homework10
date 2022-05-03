package com.sainnt.geekbrains.homework10.controller;

import com.sainnt.geekbrains.homework10.dto.CreateOrderDto;
import com.sainnt.geekbrains.homework10.entity.Order;
import com.sainnt.geekbrains.homework10.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/order")
public class OrderController extends CrudController<Order> {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        super(orderService);
        this.orderService = orderService;
    }

    @PostMapping
    public Order createOrder(@RequestBody CreateOrderDto order) {
        return orderService.createOrder(order);
    }
}
