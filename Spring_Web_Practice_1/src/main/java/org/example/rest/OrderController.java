package org.example.rest;

import org.example.rest.entity.Order;
import org.example.rest.service.OrderService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/api/orders")
    @Transactional
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @GetMapping("/api/orders/{id}")
    @Transactional
    public Order getOrder(@PathVariable("id") Integer id) {
        return orderService.getOrderById(id);
    }

    @PostMapping("/api/orders")
    public Order createOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping("api/orders")
    public Order updateOrder(@RequestBody Order order) {
        return orderService.save(order);
    }

    @DeleteMapping("/api/orders/{id}")
    public void deleteOrder(@PathVariable("id") Integer id) {
        orderService.delete(id);
    }
}
