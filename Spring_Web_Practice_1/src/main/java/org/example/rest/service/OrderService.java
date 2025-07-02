package org.example.rest.service;

import org.example.rest.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();

    Order getOrderById(Integer id);

    Order save(Order order);

    void delete(Integer id);
}
