import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main(String[] args) {
        String myfile = "myText.txt";
        String copy = "Copy.txt";
        System.out.println(copier(myfile, copy));
    }

    public static boolean copier(String str1, String str2) {
        List<String> content = new ArrayList();
        try {
            Path filePath = Paths.get(str1);
            content = Files.readAllLines(filePath);
            Path filePath2 = Paths.get(str2);
            Files.write(filePath2, content);
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful