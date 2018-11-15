public class BunniesAgain {
    public static void main(String[] args) {
        int bunnies = 6;
        int ears = 2;
        System.out.println(BunniesAgain(bunnies,ears));
    }
    public static int BunniesAgain(int bunnies, int ears){
        if (bunnies == 0){
            return bunnies;
        } else if ((bunnies % 2) == 0){
            return BunniesAgain(bunnies-1, ears) + ears + 1;
        } else return BunniesAgain(bunnies-1, ears) + ears;
    }
}
// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).