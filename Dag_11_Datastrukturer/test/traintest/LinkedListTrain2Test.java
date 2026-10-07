package traintest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import train.LinkedListTrain;
import train.LinkedListTrain2;
import train.WagonNode;


import static org.junit.jupiter.api.Assertions.assertEquals;

class LinkedListTrain2Test {
    private WagonNode locomotive;

    private WagonNode wagon1;
    private WagonNode wagon2;
    private WagonNode wagon3;
    private WagonNode wagon4;
    private WagonNode wagon5;
    private WagonNode wagon6;

    @BeforeEach
    void setUp() throws Exception {
        this.locomotive = new WagonNode("Locomotive");

        this.wagon1 = new WagonNode("Passenger carriage");
        this.wagon2 = new WagonNode("Platform wagon");
        this.wagon3 = new WagonNode("Centerbeam");
        this.wagon4 = new WagonNode("Autorack");
        this.wagon5 = new WagonNode("Hopper");
        this.wagon6 = new WagonNode("Container");

    }


    @Test
    void test_linkedListTrain2_CanAddLastWagon() {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain2 train = new LinkedListTrain2();

        // --------------------------------------------------
        // ACT
        // --------------------------------------------------


        train.addLast(locomotive);
        train.addLast(wagon1);
        train.addLast(wagon2);
        train.addLast(wagon3);
        train.addLast(wagon4);
        train.addLast(wagon5);

        // --------------------------------------------------
        // ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getFirst();
        assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon5, wagonSelected);

        WagonNode previousWagon = wagonSelected.getPreviousWagon();
        assertEquals(wagon4, previousWagon);
    }

    @Test
    void test_linkedListTrain2_CanGetLast() {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        LinkedListTrain2 train = new LinkedListTrain2();

        train.addFirst(wagon5);
        train.addFirst(wagon4);
        train.addFirst(wagon3);
        train.addFirst(wagon2);
        train.addFirst(wagon1);
        train.addFirst(locomotive);
        train.setLastWagon(wagon5);


        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        WagonNode wagonSelected = train.getFirst();
        assertEquals(locomotive, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon1, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon2, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon3, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon4, wagonSelected);

        wagonSelected = wagonSelected.getNextWagon();
        assertEquals(wagon5, wagonSelected);

        WagonNode lastWagon = train.getLast();
        assertEquals(wagon5, lastWagon);
    }
}
