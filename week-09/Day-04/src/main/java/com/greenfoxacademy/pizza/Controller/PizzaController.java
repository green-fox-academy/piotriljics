package com.greenfoxacademy.pizza.Controller;

import com.greenfoxacademy.pizza.Model.PageRequest;
import com.greenfoxacademy.pizza.Model.PizzaOrder;
import com.greenfoxacademy.pizza.Service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.awt.print.Pageable;

@Controller
public class PizzaController {
    PizzaService pizzaService;

    @Autowired
    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @GetMapping("/")
    public String main() {
        return "index";
    }

    @PostMapping("/order")
    public String order(@ModelAttribute PizzaOrder pizzaOrder) {
        if (pizzaService.validate(pizzaOrder)) {
            pizzaService.save(pizzaOrder);
            return "redirect:/order/" + pizzaOrder.getId();
        } else {
            return "error";
        }
    }

    @GetMapping("/order/{orderId}")
    public String getOrder(@PathVariable Long orderId, Model model) {
        model.addAttribute("orderDetails", pizzaService.findOrder(orderId));
        return "order";
    }
    @GetMapping("/statistics")
    public String statistics(Model model){
        model.addAttribute("orderList", pizzaService.listMostordered());
        return "statistics";
    }
}
