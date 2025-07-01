package org.example.rest.dao;

import org.example.rest.entity.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();
}
