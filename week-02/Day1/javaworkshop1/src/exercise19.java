import java.util.Scanner;


public class exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Can you please give me a number?");
        double userInput1 = scanner.nextDouble();
        if (userInput1 <= 0) {
            System.out.println("Not enough");
        } else if (userInput1 == 1) {
            System.out.println("One.");
        } else if (userInput1 == 2) {
            System.out.println("Two.");
        }  else {
            System.out.println("A lot");
        }
    }
    // Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

}
