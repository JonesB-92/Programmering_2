package Opgave_02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter counter1;

    @BeforeEach
    void setup(){
        counter1 = Counter.getInstance();
        counter1.reset();
    }

    @Test
    void testCount(){
        //Act & Assert
        counter1.count();

        assertEquals(1, counter1.getValue());

        counter1.count();
        assertEquals(2, counter1.getValue());
    }

    @Test
    void testTimesTwo(){
        //Act & Assert
        counter1.times2();
        assertEquals(0, counter1.getValue());

        counter1.count();
        counter1.times2();
        assertEquals(2, counter1.getValue());

        counter1.times2();
        assertEquals(4, counter1.getValue());
    }

    @Test
    void testZero() {
        //Act & Assert
        counter1.count();

        assertEquals(1, counter1.getValue());

        counter1.reset();
        assertEquals(0, counter1.getValue());

        counter1.count();

        assertEquals(1, counter1.getValue());
    }

    @Test
    void testSingleton() {
        //Act & Assert
        counter1.count();
        counter1.count();
        assertEquals(2, counter1.getValue());

        Counter counter2 = Counter.getInstance();
        assertEquals(counter1.getValue(), counter2.getValue());
        assertEquals(counter1, counter2);

        counter2.times2();
        assertEquals(4, counter1.getValue());
        assertEquals(4, counter2.getValue());
    }

}