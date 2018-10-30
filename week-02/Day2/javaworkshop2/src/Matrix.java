public class Matrix {
    public static void main(String[] args) {
        int a = 4;
        int[][] dynamic = new int[a][a];
        for (int i = 0; i < a; i = i + 1) {
            for (int j = 0; j < a; j = j + 1) {
                if (i==j) {
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println(" ");
        }
    }
}
// - Create (dynamically) a two dimensional array
//   with the following matrix. Use a loop!
//
//   1 0 0 0
//   0 1 0 0
//   0 0 1 0
//   0 0 0 1
//
// - Print this two dimensional array to the output