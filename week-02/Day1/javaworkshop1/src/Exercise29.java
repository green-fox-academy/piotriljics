/*public class Exercise29 {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 0; i < a; i = i + 1) {
            //szóközrajzoló
            for (int j = 0; j < a - i; j = j + 1) {
                System.out.print(" ");
            }
            //csillagrajzoló
            for (int k = 0; k <= i; k = k + 1) {
                if (k > 0) {
                    System.out.print("**");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
*/
// Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was