package CountLetters;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CountLettersTest {
    private CountLetters countLetters = new CountLetters();
    private HashMap<String, Integer> newHashmap = new HashMap<>();

    @BeforeEach
    void setUp() {
    }

    @Test
    void countLetters() {
        newHashmap.put("a",2);
        newHashmap.put("b",2);
        newHashmap.put("c",2);
        newHashmap.put("d",1);

        assertEquals(newHashmap,countLetters.countTheLetters("abcabcd"));
    }
}