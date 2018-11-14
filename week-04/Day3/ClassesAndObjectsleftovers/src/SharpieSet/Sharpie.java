package SharpieSet;

public class Sharpie {
    float inkAmount;
    String color;
    float width;

    public Sharpie(String color, float width) {
        inkAmount = 100;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sharpie{" +
                "inkAmount=" + inkAmount +
                ", color='" + color + '\'' +
                ", width=" + width +
                '}';
    }
}
