package Farm;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animalList = new ArrayList<Animal>();

    public void breed(int freePlaces, Animal name) {
        if (freePlaces > 0) {
            animalList.add(name);
        }
    }

    public void slaughter() {
        int toSlaughter = 0;
        int indexOf = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).hunger > toSlaughter) {
                toSlaughter = animalList.get(i).hunger;
                indexOf = i;
            }
        }
        animalList.remove(indexOf);
    }

    @Override
    public String toString() {
        return "Farm{" +
                "animalList=" + animalList +
                '}';
    }
}

/*it has list of Animals
                it has slots which defines the number of free places for animals
        breed() -> creates a new animal if there's place for it
        slaughter() -> removes the least hungry animal*/