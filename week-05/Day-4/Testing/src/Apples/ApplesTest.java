package Apples;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ApplesTest {

    Apples apples;

    @BeforeEach
    void setUp() {
        apples = new Apples();
    }

    @org.junit.jupiter.api.Test
    void getApple() {
        assertEquals("Apple", apples.getApple());
    }
}