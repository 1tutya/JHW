package org.example.rest.service;

import lombok.RequiredArgsConstructor;
import org.example.rest.dao.OrderRepository;
import org.example.rest.dao.OrderRepositoryImpl;
import org.example.rest.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    public List<Order> getOrdersContainsA() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().filter(o -> o.getProduct().contains("a")).collect(Collectors.toList());
    }
}
