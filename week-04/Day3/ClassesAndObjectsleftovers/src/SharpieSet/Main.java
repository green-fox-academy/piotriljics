package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sharpie sharpie = new Sharpie("black", 10);
        Sharpie one = new Sharpie("yellow", 100);
        one.inkAmount = 0;
        Sharpie two = new Sharpie("red", 100);
        two.inkAmount = 15;
        Sharpie three = new Sharpie("orange", 100);
        three.inkAmount = 0;
        Sharpie four = new Sharpie("green", 100);
        four.inkAmount = 88;
        Sharpie five = new Sharpie("gray", 100);
        five.inkAmount = 0;
        Sharpie six = new Sharpie("black", 100);
        Sharpie seven = new Sharpie("black", 100);

        List<Sharpie> sharpieList = new ArrayList<Sharpie>();
        sharpieList.add(one);
        sharpieList.add(two);
        sharpieList.add(three);
        sharpieList.add(four);
        sharpieList.add(five);
        sharpieList.add(six);
        sharpieList.add(seven);
        sharpieList.add(sharpie);

        SharpieSet setOfSharpies = new SharpieSet(sharpieList);

        System.out.println(setOfSharpies.countUsable());
    }
}
