package com.sainnt.geekbrains.homework10.service.impl;

import com.sainnt.geekbrains.homework10.dto.CreateOrderDto;
import com.sainnt.geekbrains.homework10.dto.OrderItemDto;
import com.sainnt.geekbrains.homework10.entity.Order;
import com.sainnt.geekbrains.homework10.entity.OrderItem;
import com.sainnt.geekbrains.homework10.entity.Product;
import com.sainnt.geekbrains.homework10.repository.OrderItemRepository;
import com.sainnt.geekbrains.homework10.repository.OrderRepository;
import com.sainnt.geekbrains.homework10.repository.ProductRepository;
import com.sainnt.geekbrains.homework10.repository.UserRepository;
import com.sainnt.geekbrains.homework10.service.CRUDServiceImpl;
import com.sainnt.geekbrains.homework10.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class OrderServiceImpl extends CRUDServiceImpl<Order> implements OrderService {
    private final UserRepository userRepository;
    private final OrderItemRepository orderItemRepository;
    private final ProductRepository productRepository;

    public OrderServiceImpl(OrderRepository orderRepository, UserRepository userRepository, OrderItemRepository orderItemRepository, ProductRepository productRepository) {
        super(orderRepository);
        this.userRepository = userRepository;
        this.orderItemRepository = orderItemRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Order createOrder(CreateOrderDto createOrderDto) {
        Order order = new Order();
        order.setUser(userRepository.getById(createOrderDto.getUserId()));
        order.setOrderItemList(
                createOrderDto.getItems()
                        .stream()
                        .map(this::mapToEntity)
                        .map(orderItemRepository::save)
                        .collect(Collectors.toList())
        );
        return repository.save(order);
    }

    private OrderItem mapToEntity(OrderItemDto orderItemDto) {
        OrderItem item = new OrderItem();
        Product product = productRepository.getById(orderItemDto.getProductId());
        item.setProduct(product);
        item.setProductPrice(product.getPrice());
        item.setAmount(orderItemDto.getAmount());
        return item;
    }
}
