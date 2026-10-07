package Opgaver_01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Opgaver_01_02Test {
    Opgaver_01_02 opgave = new Opgaver_01_02();
    ArrayList<Integer> ints = new ArrayList<>();

    void setupIntList(){
        ints.add(10);
        ints.add(12);
        ints.add(22);
        ints.add(16);
    }

    @Test
    void test_summeringLige() {
        // Arrange
        setupIntList();

        // Act
        int expected = 60;
        int actual = opgave.summering(ints);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_summeringUlige() {
        // Arrange
        setupIntList();
        ints.add(10);

        // Act
        int expected = 70;
        int actual = opgave.summering(ints);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_summeringNul() {

        // Act
        int expected = 0;
        int actual = opgave.summering(ints);

        // Assert
        assertEquals(expected, actual);
        assertEquals(0, ints.size());
    }

    @Test
    void test_summeringÉn() {
        // Arrange
        ints.add(10);

        // Act
        int expected = 10;
        int actual = opgave.summering(ints);

        // Assert
        assertEquals(expected, actual);
        assertEquals(1, ints.size());
    }

    @Test
    void test_antalZeros() {
        // Arrange
        setupIntList();
        ints.add(10);
        ints.add(0);
        ints.add(0);
        ints.add(0);
        ints.add(1240);
        ints.add(8210);
        ints.add(420);
        ints.add(1312);
        ints.add(1337);

        // Act
        int expected = 3;
        int actual = opgave.amountOfZeros(ints);

        // Assert
        assertEquals(expected, actual);
    }

//    @Test
//    void test_MergeSort() {
//        // Arrange
//        setupIntList();
//        ints.add(10);
//        ints.add(0);
//        ints.add(0);
//        ints.add(0);
//        ints.add(1240);
//        ints.add(8210);
//        ints.add(420);
//        ints.add(1312);
//        ints.add(1337);
//
//        // Act
//        ArrayList<Integer> expected = new ArrayList<>();
//        Collections.sort(ints);
//        int actual = opgave.amountOfZeros(ints);
//
//        // Assert
//        assertEquals(expected, actual);
//    }

}