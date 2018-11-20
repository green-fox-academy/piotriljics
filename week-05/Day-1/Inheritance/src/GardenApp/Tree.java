package GardenApp;

public class Tree extends Plants {

    public Tree(String color) {
        absorb = 0.4;
        minimumWater = 10;
        super.setColor(color);
        waterLevel = 0;
    }
}