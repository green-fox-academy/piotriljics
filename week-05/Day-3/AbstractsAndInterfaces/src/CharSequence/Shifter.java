package CharSequence;

import java.util.stream.IntStream;

public class Shifter implements CharSequence {
    String str;
    int n;

    public Shifter(String str, int n) {
        this.str = str;
        this.n = n;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index + n);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
