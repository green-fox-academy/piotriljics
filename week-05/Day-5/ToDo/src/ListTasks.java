import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTasks {
    List<String> myTasks = new ArrayList<>();


    public void listTask() {
        try {
            myTasks = Files.readAllLines(Paths.get("List.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (myTasks.size() ==0){
            System.out.println("No todos for today! :)");
        } else {
            for (int i = 0; i < myTasks.size() ; i++) {
                System.out.println(i +1 + " - " + myTasks.get(i));
            }
        }

    }
    public void addNew(String[] newString){
        try {
            myTasks = Files.readAllLines(Paths.get("List.txt"));
            myTasks.toArray();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void remove(ArrayList<String> myList){

    }
    public void complete(ArrayList<String> myList){}
}
