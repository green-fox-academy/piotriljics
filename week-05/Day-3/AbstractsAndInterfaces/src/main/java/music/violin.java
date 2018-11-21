package main.java.music;

public class violin extends StringedInstrument {
    public violin() {
        setName("violin");
        numberOfStrings = 4;
    }

    @Override
    public void sound(String sound) {
        super.sound("Screech");
    }
}
