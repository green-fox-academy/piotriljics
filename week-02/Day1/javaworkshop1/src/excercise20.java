import java.util.Scanner;

public class excercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me two numbers:");
        int userInput1 = scanner.nextInt();
        int userInput2 = scanner.nextInt();

        if (userInput1 > userInput2) {
            System.out.println("The bigger number wast the first.");
        } else {
            System.out.println("The bigger number wast the second.");
        }
    }
}
// Write a program that asks for two numbers and prints the bigger one