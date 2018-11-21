package main.java.music;

public class electricGuitar extends StringedInstrument{

    public electricGuitar(){
        setName("electricGuitar");
        numberOfStrings = 6;
    }
    public electricGuitar(int number){
        setName("electricGuitar");
        numberOfStrings = number;
    }

    @Override
    public void sound(String sound) {
        super.sound("Twang");
    }
}
