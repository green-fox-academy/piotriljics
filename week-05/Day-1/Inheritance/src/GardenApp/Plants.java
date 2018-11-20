package GardenApp;

public class Plants {
    double waterLevel;
    String color;
    double absorb;
    int minimumWater;

    public Plants() {
        this.color = "";
        this.absorb = 0;
        this.minimumWater = 0;
        this.waterLevel = 0;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
