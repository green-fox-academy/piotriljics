package CharSequence;

import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    String gnirt;

    public Gnirts(String gnirt) {
        this.gnirt = gnirt;
    }


    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return gnirt.charAt(gnirt.length() - 1 - index);
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }
}