package org.example.mvc.services;

import org.example.mvc.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrders();

    void save(OrderDto orderDto);

    void delete(Integer id);

    OrderDto getById(Integer id);
}
