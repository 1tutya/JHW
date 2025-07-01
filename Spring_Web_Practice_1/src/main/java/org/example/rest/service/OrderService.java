package org.example.rest.service;

import org.example.rest.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrdersContainsA();
}
