package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden extends Plants {
    List<Plants> flowersAndTrees= new ArrayList<>();

    public void watering(int water) {
        double portion = water/flowersAndTrees.size();
        for (Plants plants: flowersAndTrees) {
            if (plants.absorb == 0.75){
                if (waterLevel<=minimumWater){
                    System.out.println("The " + plants.getColor() + " Flower needs water");
                    waterLevel = portion * absorb;
                } else {
                    System.out.println("The " + plants.getColor() + " Flower doesn't need water");
                }
            } else {
                if (waterLevel<=minimumWater){
                    System.out.println("The " + plants.getColor() + " Tree needs water");
                    waterLevel = portion * absorb;
                } else {
                    System.out.println("The " + plants.getColor() + " Tree doesn't need water");
                }
            }
        }
    }
}