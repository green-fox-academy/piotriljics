import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    public void testForOneBook() {
        Main main = new Main();
        int[] booksPrice = {1};
        assertEquals(8, main.priceCalculator(booksPrice));
    }

    @org.junit.jupiter.api.Test
    public void testForMoreBook() {
        Main main = new Main();
        int[] booksPrice = {1, 1, 1, 1, 1};
        assertEquals(30, main.priceCalculator(booksPrice));
    }

    @org.junit.jupiter.api.Test
    public void testForMoreBook2() {
        Main main = new Main();
        int[] booksPrice = {1, 2, 1, 1, 3};
        assertEquals(53.2, main.priceCalculator(booksPrice));
    }
    @org.junit.jupiter.api.Test
    public void testSuggested() {
        Main main = new Main();
        int[] booksPrice = {0, 1, 2, 3, 4};
        assertEquals(70.4, main.priceCalculator(booksPrice));
    }
}