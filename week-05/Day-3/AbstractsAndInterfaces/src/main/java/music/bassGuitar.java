package main.java.music;

public class bassGuitar extends StringedInstrument {
    public bassGuitar() {
        setName("bassGuitar");
        numberOfStrings = 4;
    }

    public bassGuitar(int number) {
        setName("bassGuitar");
        numberOfStrings = number;
    }
    @Override
    public void sound(String sound) {
        super.sound("Duum-duum-duum");
    }
}
