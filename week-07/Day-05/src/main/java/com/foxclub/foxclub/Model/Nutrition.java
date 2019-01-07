package com.foxclub.foxclub.Model;

import java.util.ArrayList;
import java.util.List;

public class Nutrition {

    public static List<String> feed(){
        List<String> foods = new ArrayList<>();
        foods.add("Leaves");
        foods.add("Roots");
        foods.add("Blood");
        return foods;
    }

    public static List<String> drink(){
        List<String> drinks = new ArrayList<>();
        drinks.add("Water");
        drinks.add("More water");
        drinks.add("Beer");
        return drinks;
    }
}
