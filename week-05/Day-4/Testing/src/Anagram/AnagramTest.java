package Anagram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    private Anagram anagram= new Anagram();
    private String str1;
    private String str2;

    @BeforeEach
    void setUp() {
        str1 = "";
        str2 = "";
    }

    @Test
    void isAnagram() {
        str1 = "dog";
        str2 = "god";
        assertTrue(anagram.isAnagram(str1, str2));
    }
}