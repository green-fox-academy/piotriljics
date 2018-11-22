package CountLetters;

import java.util.HashMap;

public class CountLetters {
    public HashMap<Character, Integer> countTheLetters(String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            if (!hashMap.containsKey(letters[i])) {
                hashMap.put(letters[i], 1);
            } else {
                hashMap.put(letters[i], hashMap.get(letters[i]) + 1);
            }
        }
        return hashMap;
    }
}
        /*for (char letter : letters) {
        if (hashMap.containsKey(letter)) {
        int count = hashMap.get(letter);
        hashMap.put(letter, count + 1);
        } else {
        hashMap.put (letter, 1);
        }*/