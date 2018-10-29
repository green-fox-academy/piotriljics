import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you please give me a number?");
        double userInput1 = scanner.nextDouble();
        if (userInput1 % 2 == 0) {
            System.out.println("Your number is even.");
        } else {
            System.out.println("Your number is odd.");
        }
    }
}
