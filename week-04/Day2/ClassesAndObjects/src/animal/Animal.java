package animal;

public class Animal {

    int defaultValue = 50;
    int hunger = defaultValue;
    int thirst = defaultValue;

    public void eat() {
        hunger--;
    }

    public void drink() {
        thirst--;
    }
    public void play(){
        thirst++;
        hunger++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "defaultValue=" + defaultValue +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                '}';
    }
}
