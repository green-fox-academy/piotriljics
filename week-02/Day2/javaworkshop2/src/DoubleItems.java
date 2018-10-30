import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int [] numList = {3, 4, 5, 6, 7};
        for (int a = 0; a < numList.length; a = a + 1) {
            numList [a] = numList [a] * 2;}
        System.out.println(Arrays.toString(numList));
    }
}

// - Create an array variable named `numList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array