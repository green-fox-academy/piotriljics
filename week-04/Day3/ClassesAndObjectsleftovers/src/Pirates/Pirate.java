package Pirates;

public class Pirate {
    String name;
    int intoxication;
    boolean alive = true;
    boolean passedOut = false;
    boolean captain = false;


    public Pirate() {
    }

    public void drinkSomeRum() {
        intoxication--;
    }

    public String howsItGoingMate(int drunkLevel) {
        String answer;
        if (drunkLevel > 0) {
            answer = "Pour me anudder!";
        } else {
            answer = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
            this.passedOut = true;
        }
        return answer;
    }

    public void die() {
        this.alive = false;
    }

    public void brawl(Pirate other) {
        int random = (int) (Math.random() * 2);
        if (other.alive || this.alive || this.passedOut|| other.passedOut && (random == 0)) {
            this.die();
        } else if (other.alive || this.alive || this.passedOut|| other.passedOut && (random == 1)) {
            this.die();
        } else {
            this.passedOut = true;
            other.passedOut = true;
        }


        /*if ((!one.alive) || (!two.alive) || (!one.passedOut) || (!two.passedOut) && (random == 1)) {
            one.die();
        } else if ((!one.alive) || (!two.alive) || (!one.passedOut) || (!two.passedOut) && (random == 2)) {
            two.die();
        } else {
            one.passedOut;
            two.passedOut;
        }*/
    }
    public void parrot() {
        intoxication++;
    }
}
  /*      brawl(x) - where pirate fights another pirate (if that other pirate is alive)
  and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
        And... if you get that far...

        Add a parrot.*/