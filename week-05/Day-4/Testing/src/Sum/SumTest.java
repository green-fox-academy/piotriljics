package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum;
    List<Integer> numberList;

    @BeforeEach
    void setUp() {
        sum = new Sum();
        numberList = new ArrayList<>();
    }

    @Test
    void sum() {
        numberList.add(22);
        numberList.add(5);
        numberList.add(10);
    assertEquals(37,sum.sum(numberList));
    }
    @Test
    void sum2() {
        assertEquals(0,sum.sum(numberList));
    }

    @Test
    void sum3() {
        numberList.add(1);
        assertEquals(1, sum.sum(numberList));
    }

    @Test
    void sum4() {
        assertEquals(null,null);
    }
}