import java.util.Random;
public class randomNumber {

    public static void main(String[] args) {

        int max = 50;
        int min = 2;
        int randomInt = (int) (Math.random() * (max - min) + 1) + min;
        // + 1 (so 50 is a part of it too) + min (??);
        System.out.println(randomInt);
    }
}
