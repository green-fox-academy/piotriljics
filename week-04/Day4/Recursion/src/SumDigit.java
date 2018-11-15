public class SumDigit {
    public static void main(String[] args) {
        int n = 44444;
        System.out.println(sumDigits(n));
    }

    public static int sumDigits(int n) {
        int lastDigit = n % 10;
        int nextDigit = n / 10;

        if (n == 0){
            return 1;
        } else return (n % 10+sumDigits (n / 10));
    }
}
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).