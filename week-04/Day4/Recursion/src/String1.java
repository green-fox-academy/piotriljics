import java.io.CharArrayWriter;

public class String1 {
    public static void main(String[] args) {
        String xChars = "The xx - crystalized";
        char from = 'x';
        char to = 'y';
        System.out.println(yChanger(xChars,from,to));

    }
    public static String yChanger(String xchars, char from, char to){
        char [] array = xchars.toCharArray();
        if (xchars.indexOf(from) == -1){
            return xchars;
        } else {
            array[xchars.indexOf(from)] = to;
            return  yChanger(new String (array),from,to);
        }
    }
}
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.