import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String lines = "myText.txt";
        System.out.println(counter(lines));

    }
    public static Integer counter(String a){
        try {
            Path filePath = Paths.get(a);
            List<String> lines = Files.readAllLines(filePath);
            return lines.size();
        } catch (IOException e){
            System.out.println("0");
        }
        return null;
    }
}
// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.