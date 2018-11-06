public class exercise28 {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0; i <= a; i = i + 1) {
                System.out.println();
            for (int j = 0; j < i; j = j + 1){
                System.out.print("*");
            }
        }

    }
}
// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was