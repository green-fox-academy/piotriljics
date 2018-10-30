public class Summing {
    public static void main(String[] args) {
        int a = 8;
        sum(a);
        int bc = 2;
        sum(bc);
    }

    public static void sum(int summary) {
        int b = 0;
        for (int i = 0 ; i <= summary ; i = i + 1) {
           b = i + b;
        }
        System.out.println(b);
    }





    //  Create the usual class wrapper
//  and main method on your own.

// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
}
