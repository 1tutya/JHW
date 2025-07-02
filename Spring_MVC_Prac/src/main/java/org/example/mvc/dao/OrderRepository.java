package org.example.mvc.dao;

import org.example.mvc.models.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();
}
