public class Bunnies {
    public static void main(String[] args) {
        int bunnies = 6;
        int ears = 2;
        System.out.println(earCounter(bunnies, ears));
    }

    public static int earCounter(int bunnyNumber, int ears) {
        if (bunnyNumber == 0) {
            return bunnyNumber;
        } else
            return earCounter(bunnyNumber - 1, ears) + ears;
    }
}
// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).