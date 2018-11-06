import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Howdy! How many chickens are on the farm?");
        int userInput1 = scanner.nextInt();
        System.out.println("My next question is, how many pigs are there?");
        int userInput2 = scanner.nextInt();
        int chickenLegs = userInput1 * 2;
        int pigLegs = userInput2 * 4;
        System.out.println("The number of the legs are: " + (chickenLegs + pigLegs));
    }
}

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have