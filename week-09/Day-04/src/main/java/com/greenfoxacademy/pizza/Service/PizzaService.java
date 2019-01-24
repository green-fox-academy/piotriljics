package com.greenfoxacademy.pizza.Service;

import com.greenfoxacademy.pizza.Model.PageRequest;
import com.greenfoxacademy.pizza.Model.PizzaOrder;
import com.greenfoxacademy.pizza.Repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {
    PizzaRepository pizzaRepository;
    PageRequest pageRequest;


    @Autowired
    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public void save(PizzaOrder pizzaOrder) {
        pizzaRepository.save(pizzaOrder);
    }

    public PizzaOrder findOrder(Long orderId) {
        Optional<PizzaOrder> pizzaOrder = pizzaRepository.findById(orderId);
       return pizzaOrder.get();
    }
    public List<Object> listMostordered(){
        return pizzaRepository.findMostOrdered();
    }
    public boolean validate(PizzaOrder pizzaOrder){
        if (pizzaOrder.getAddress() != null && pizzaOrder.getName() != null && pizzaOrder.getPizza() != null &&
                pizzaOrder.getAddress() != "" && pizzaOrder.getName() != "" && pizzaOrder.getPizza() != ""){
            return true;
        } return false;
    }
}
