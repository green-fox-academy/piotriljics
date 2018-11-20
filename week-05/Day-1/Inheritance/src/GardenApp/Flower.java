package GardenApp;

public class Flower extends Plants {

    public Flower(String color) {
        absorb = 0.75;
        minimumWater = 5;
        super.setColor(color);
        waterLevel = 0;
    }
}