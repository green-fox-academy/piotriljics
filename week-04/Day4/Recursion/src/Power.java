public class Power {
    public static void main(String[] args) {
        int n = 4;
        int base = 2;
        System.out.println(powerN(n, base));
    }

    public static int powerN(int n, int b) {
        if (n == 1) {
            return b;
        } else {
            return b * powerN(n -1, b);
        }
    }
}

// Given base and n that are both 1 or more, compute recursively (no loops)
// the value of base to the n power, so powerN(3, 2) is 9 (3 squared).