package com.swaggerex4.swaggerex4;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders1")
public class Controller {

    private static List<Order> orders = new ArrayList<Order>();

    @GetMapping
    public List<Order> getOrders() {
        return orders;

    }

    @PostMapping
    public Order addOrders(@RequestBody Order order) {
        orders.add(order);
        return order;
    }

}