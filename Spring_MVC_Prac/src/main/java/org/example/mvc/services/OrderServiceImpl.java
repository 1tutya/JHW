package org.example.mvc.services;

import org.example.mvc.dao.OrderRepository;
import org.example.mvc.dto.OrderDto;
import org.example.mvc.models.Order;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, ModelMapper modelMapper) {
        this.orderRepository = orderRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<OrderDto> getOrders() {
        List<Order> orders = orderRepository.findAll();
        return orders.stream().map(order -> modelMapper.map(order, OrderDto.class)).collect(Collectors.toList());
    }

    @Override
    public void save(OrderDto orderDto) {
        Order order = modelMapper.map(orderDto, Order.class);
        order.setCreated_at(LocalDate.now());
        orderRepository.save(order);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.delete(id);
    }

    @Override
    public OrderDto getById(Integer id) {
        Order order = orderRepository.getById(id);
        return modelMapper.map(order, OrderDto.class);
    }
}
