package com.foxclub.foxclub.Model;

import com.fasterxml.jackson.annotation.JsonTypeId;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Quokka {

    @Id
    private String name;
    //private List<Trix> listOfTrix;
    private String food;
    private String drink;

    public Quokka() {
    }

    public Quokka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
