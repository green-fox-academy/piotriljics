package com.greenfoxacademy.pizza.Controller;

import com.greenfoxacademy.pizza.Model.PizzaOrder;
import com.greenfoxacademy.pizza.Service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzaRestController {
    PizzaService pizzaService;

    @Autowired
    public PizzaRestController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/api/order/{id}")
    public PizzaOrder listPizzaOrders(@PathVariable Long id){
        return pizzaService.findOrder(id);
    }
}
