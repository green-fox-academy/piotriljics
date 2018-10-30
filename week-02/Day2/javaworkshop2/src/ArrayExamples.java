public class ArrayExamples {
    public static void main(String[] args) {
        int[] numbers = new int[10];       //array
        System.out.println(numbers.toString());
        System.out.println(numbers);
        System.out.println(numbers[0]);
        numbers[9] = 10;
        System.out.println(numbers.length);
        numbers[numbers.length - 1] = 100;
        int[][] matrix;
//        final = making something constant
        final boolean[] booleans = new boolean[2];
        booleans[0] = true;
    }
}
