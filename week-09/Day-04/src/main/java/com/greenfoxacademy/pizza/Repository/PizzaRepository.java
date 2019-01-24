package com.greenfoxacademy.pizza.Repository;

import com.greenfoxacademy.pizza.Model.PizzaOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PizzaRepository extends JpaRepository <PizzaOrder, Long>{
    @Query(value = "SELECT pizza FROM pizza_order GROUP BY pizza ORDER BY count(pizza) DESC LIMIT 3", nativeQuery = true)
    List<Object> findMostOrdered();
}
