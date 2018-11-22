package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();
    int number = 6;

    @BeforeEach
    void setUp() {
    }
    @Test
    void isItFibonacci() {
        assertEquals(8, fibonacci.fibonacci(number));
    }
}