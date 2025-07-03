package org.example.mvc.controllers;

import jakarta.validation.Valid;
import org.example.mvc.dto.OrderDto;
import org.example.mvc.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public String getOrders(Model model) {
        List<OrderDto> orders = orderService.getOrders();
        model.addAttribute("orders", orders);
        return "orders";
    }

    @GetMapping("/orders/add")
    public String addOrder(Model model) {
        model.addAttribute("addOrderDto", new OrderDto());
        return "addOrder";
    }

    @PostMapping("/orders/save")
    public String saveOrder(@Valid @ModelAttribute("addOrderDto") OrderDto orderDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "addOrder";
        }
        orderService.save(orderDto);
        return "redirect:/orders";
    }

    @GetMapping("/orders/delete")
    public String deleteOrder(@RequestParam("id") Integer id) {
        orderService.delete(id);
        return "redirect:/orders";
    }

    @GetMapping("/orders/edit")
    public String editOrder(@RequestParam("id") Integer id, Model model) {
        OrderDto order = orderService.getById(id);
        model.addAttribute("addOrderDto", order);
        return "addOrder";
    }
}
