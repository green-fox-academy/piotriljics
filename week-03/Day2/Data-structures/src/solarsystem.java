import java.util.ArrayList;
import java.util.Arrays;

public class solarsystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune"));
        //planetList.add(5, "Saturn");
        //System.out.println(planetList);
        System.out.println(putSaturn(planetList));
        // Saturn is missing from the planetList
        // Insert it into the correct position
        // Create a method called putSaturn() which has list parameter and returns the correct list.
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"*/
        }
        public static ArrayList<String> putSaturn (ArrayList<String> myList) {
                myList.add(5, "Saturn");
                return myList;
        }
    }

