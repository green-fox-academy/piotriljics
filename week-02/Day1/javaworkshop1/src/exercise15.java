import java.util.Scanner;


public class exercise15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much did you walk today?");
        double userInput1 = scanner.nextDouble();
        double miles = userInput1 * 0.621371192;
        System.out.println(miles);
    }
}
