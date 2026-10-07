package Opgave_03.opgave3Teater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TheaterFloorTest {
    @Test
    void altVirker() {

    }

    @Test
    void test_buySeat_row_seat_returns_price_for_available() {

        // Arrange
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.setSeats(new int[][]{
                {10, 20, 30},
                {20, 30, 10},
                {30, 10, 20}});

        // Act
        int expectedPrice = 30;
        int actualPrice = theaterFloor.buySeat(1, 1);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void test_buySeat_row_seat_returns_0_for_occupied() {

        // Arrange
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.setSeats(new int[][]{
                {10, 20, 30},
                {20, 30, 10},
                {30, 10, 20}});
        theaterFloor.buySeat(1, 1);

        // Act
        int expectedPrice = 0;
        int actualPrice = theaterFloor.buySeat(1, 1);


        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void test_buySeat_price_returns_price_for_available() {

        // Arrange
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.setSeats(new int[][]{
                {10, 10, 10},
                {0, 20, 0},
                {30, 30, 30}
        });

        // Act
        int expectedPrice = 20;
        int actualPrice = theaterFloor.buySeat(20);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }

    @Test
    void test_buySeat_price_returns_0_for_occupied() {

        // Arrange
        TheaterFloor theaterFloor = new TheaterFloor();
        theaterFloor.setSeats(new int[][]{
                {10, 10, 10},
                {0, 20, 0},
                {30, 30, 30}
        });
        theaterFloor.buySeat(20);

        // Act
        int expectedPrice = 0;
        int actualPrice = theaterFloor.buySeat(20);

        // Assert
        assertEquals(expectedPrice, actualPrice);
    }
}