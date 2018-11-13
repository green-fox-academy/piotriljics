package counter;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.setFieldValue(10);
        counter.Get();
        counter.Add();
        counter.Get();
        counter.AddNumber(83);
        counter.Get();
        counter.Reset();
        counter.Get();
    }
}
