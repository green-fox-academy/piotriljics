package Pirates;

public class Main {
    public static void main(String[] args) {
        Pirate bob = new Pirate();
        bob.intoxication = 4;
        bob.captain= false;
        System.out.println(bob.howsItGoingMate(bob.intoxication));
        bob.drinkSomeRum();
        bob.drinkSomeRum();
        bob.drinkSomeRum();
        System.out.println(bob.howsItGoingMate(bob.intoxication));

        Pirate jack = new Pirate();
        jack.intoxication =4;
        jack.captain= true;
        jack.
    }
}
