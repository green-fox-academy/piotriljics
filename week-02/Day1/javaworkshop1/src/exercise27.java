public class exercise27 {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a = a + 1)
            if (a % 3 == 0) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(a);
            }
    }

}

