package SharpieSet;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet(List<Sharpie> sharpies) {
        this.sharpies = sharpies;
    }

    public int countUsable() {
        int usable = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                usable++;
            }
        }
        return usable;
    }

    public void removeTrash(ArrayList<Sharpie> sharpies) {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(i);
                System.out.println("Empty sharpies were removed");
            }
        }
    }

    //countUsable() -> sharpie is usable if it has ink in it
    //removeTrash() -> removes all unusable sharpies

    @Override
    public String toString() {
        return "SharpieSet{" +
                "sharpies=" + sharpies +
                '}';
    }
}
