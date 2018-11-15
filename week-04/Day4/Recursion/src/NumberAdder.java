public class NumberAdder {
    public static void main(String[] args) {
        System.out.println(adder(5));
    }

    public static int adder(int n) {
        //System.out.println(n);
        if (n == 1) {
            return n;
        }
        return adder(n-1)+ n;

    }
}
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.