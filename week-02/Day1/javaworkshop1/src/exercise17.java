import java.util.Scanner;

public class exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! I need five numbers.");
                int userInput1 = scanner.nextInt();
                int userInput2 = scanner.nextInt();
                int userInput3 = scanner.nextInt();
                int userInput4 = scanner.nextInt();
                int userInput5 = scanner.nextInt();

                int sum = userInput1+userInput2+userInput3+userInput4+userInput5;
                int ave = sum / 5;

        System.out.println("The sum of the numbers are: " + sum);
        System.out.println("The average of the numbers are: " + ave);
    }
}
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4