package main.java.music;

public abstract class StringedInstrument extends Instument {
    int numberOfStrings;

    public StringedInstrument() {
    }

    public void sound(String sound) {
    }

    @Override
    public void play(String sound) {
        sound(sound);
    }
}

