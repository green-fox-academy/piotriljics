public class Counter {

    public static void main(String[] args) {
    Counter(10);
    }

    public static void Counter(int n) {
        System.out.println(n);
        if (n == 0) {
            return;
        }
        Counter(n - 1);
    }
}
