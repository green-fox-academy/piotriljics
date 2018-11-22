package Sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {
        List<Integer> myList = new ArrayList<>();


    public int sum(List<Integer> myList) {
        this.myList=myList;
        int sum = 0;
        for (int i = 0; i < myList.size() ; i++) {
            sum = sum + myList.get(i);
        }
        return sum;
    }
}
