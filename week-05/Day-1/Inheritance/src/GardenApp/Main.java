package GardenApp;

public class Main {
    public static void main(String[] args) {
        Garden plantsOfMine = new Garden();
        Tree tree = new Tree("green");
        Flower flower = new Flower("yellow");
        plantsOfMine.flowersAndTrees.add(tree);
        plantsOfMine.flowersAndTrees.add(flower);
        plantsOfMine.watering(60);
    }
}
