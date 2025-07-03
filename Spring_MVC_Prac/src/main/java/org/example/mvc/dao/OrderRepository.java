package org.example.mvc.dao;

import org.example.mvc.dto.OrderDto;
import org.example.mvc.models.Order;

import java.util.List;

public interface OrderRepository {
    List<Order> findAll();

    void save(Order order);

    void delete(Integer id);

    Order getById(Integer id);
}
