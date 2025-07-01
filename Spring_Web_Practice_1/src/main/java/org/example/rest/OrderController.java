package org.example.rest;

import org.example.rest.entity.Order;
import org.example.rest.service.OrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/api/orders")
    @Transactional
    public List<Order> getOrders() {
        return orderService.getOrdersContainsA();
    }
}
