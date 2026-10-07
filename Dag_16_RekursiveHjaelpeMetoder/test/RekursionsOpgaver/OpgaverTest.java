package RekursionsOpgaver;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OpgaverTest {
    private ArrayList<Integer> intlist = new ArrayList<>();
    private Opgaver calculator = new Opgaver();

    void setupIntList() {
        for (int i = 0; i <= 10; i++) {
            intlist.add(i);
        }
    }


    @Test
    void ligeTal() {
        // Arrange
        setupIntList();

        System.out.println(intlist);

        // Act
        int expected = 6;
        int actual = Opgaver.ligeTal(intlist);

        // Assert
        assertEquals(expected, actual);

    }


    @Test
    void ligeTal1() {
        // Arrange
        setupIntList();

        // Act
        int expected = 6;
        int actual = Opgaver.ligeTal1(intlist);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testLigeTal1_Hjaelper() {
        // Arrange
        setupIntList();

        // Act
        int expected = 6;

        int actual = Opgaver.ligeTal1(intlist, 0);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void testLigeTal1_Hjaelper_FraMidt() {
        // Arrange
        setupIntList();

        // Act
        int expected = 3;
        int actual = Opgaver.ligeTal1(intlist, intlist.size() / 2);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_IsPalindromeTrue_Even() {
        // Arrange
        String palindrom = "Hannah";

        // Act
        boolean expected = true;
        boolean actual = Opgaver.palindrom(palindrom);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_IsPalindromeTrue_Uneven() {
        // Arrange
        String palindrom = "Racecar";

        // Act
        boolean expected = true;
        boolean actual = Opgaver.palindrom(palindrom);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void test_IsPalindromeFalse_Even() {
        // Arrange
        String palindrom = "Hanmah";

        // Act
        boolean actual = Opgaver.palindrom(palindrom);

        // Assert
        assertFalse(actual);
    }

    @Test
    void test_IsPalindromeFalse_Uneven() {
        // Arrange
        String palindrom = "Hanmmah";

        // Act
        boolean actual = Opgaver.palindrom(palindrom);

        // Assert
        assertFalse(actual);
    }

    @Test
    void test_Contains() {
        // Arrange
        int[] nums = {10, 12, 14, 15, 420, 1312, 1337, 8210, 16234};
        Opgaver calculator = new Opgaver();


        // Act
        boolean actual = Opgaver.contains(nums, 8210);
        boolean actual1 = Opgaver.contains(nums, 16233);

        // Assert
        assertTrue(actual);
        assertFalse(actual1);
    }

}