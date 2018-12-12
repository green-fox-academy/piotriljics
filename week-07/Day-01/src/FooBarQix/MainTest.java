package FooBarQix;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    public void Test1(){
        Main main = new Main();
        assertEquals("1", main.fooBarQix(1));
    }

    @org.junit.jupiter.api.Test
    public void Test3(){
        Main main = new Main();
        assertEquals("foo", main.fooBarQix(3));
    }
    @org.junit.jupiter.api.Test
    public void Test5(){
        Main main = new Main();
        assertEquals("bar", main.fooBarQix(5));
    }

    @org.junit.jupiter.api.Test
    public void Test7(){
        Main main = new Main();
        assertEquals("qix", main.fooBarQix(7));
    }
    @org.junit.jupiter.api.Test
    public void Test35(){
        Main main = new Main();
        assertEquals("foobar", main.fooBarQix(15));
    }

    @org.junit.jupiter.api.Test
    public void Test13(){
        Main main = new Main();
        assertEquals("foo", main.fooBarQix(13));
    }
}