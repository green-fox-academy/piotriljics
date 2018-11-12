import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logs {
    public static void main(String[] args) {
        String log = "log.txt";


        Path filePath = Paths.get(log);
        List<String> contentIp = new ArrayList();
        List<String> contentGetPost = new ArrayList();
        try {
            List<String> logAr = new ArrayList();
            logAr = Files.readAllLines(filePath);
            for (int i = 0; i < logAr.size(); i++) {
                if (!contentIp.contains(logAr.get(i).split("\\s+")[5])) {
                    contentIp.add(logAr.get(i).split("\\s+")[5]);
                }
                contentGetPost.add(logAr.get(i).split("\\s+")[6]);
            }
            int occurancesGet = 0;
            int occurancesPost = 0;
            for (int i = 0; i < contentGetPost.size(); i++) {
                if (contentGetPost.get(i).equals("GET")) {
                    occurancesGet++;
                } else {
                    occurancesPost++;
                }
            }
            System.out.println(occurancesGet + "," + occurancesPost);

            /*double occurrences = Collections.frequency(contentGetPost, "GET");
            double occurrences2 = Collections.frequency(contentGetPost, "POST");
            System.out.println(occurrences2/occurrences);*/
        } catch (IOException e) {
            System.out.println("whoops");
        }
        System.out.println(contentIp);
    }
}
/*
    public static Array ipAdresses(String str) {
        List<String> content = new ArrayList();
        try {
            Path filePath = Paths.get(str);
            content = Files.readAllLines(filePath);
            return content;
        } catch (IOException e) {
            System.out.println("whoops");
        }
        return content;
*/


// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.