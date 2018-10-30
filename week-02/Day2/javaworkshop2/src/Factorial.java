public class Factorial {
    public static void main(String[] args) {
        int a = 9;
        factorio(a);

    }

    public static void factorio(int facto) {
        int b = 1;
        for (int c = 1; c <= facto; c = c + 1) {
            b = c * b;
        }
        System.out.println(b);
    }
}




        //System.out.println();
    //  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

