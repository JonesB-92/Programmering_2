import bryghus.Produkt;
import bryghus.Salg;
import deque.CircularArrayDeque;
import deque.DequeI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ObjectInputStream;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircularArrayDequeTest {
    private DequeI deque;
    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setup() {
        this.deque = new CircularArrayDeque(5);

        Produkt kloster = new Produkt("Klosterbryg");
        Produkt sweet = new Produkt("Sweet Georgia Brown");
        Produkt extra = new Produkt("Extra Pilsner");
        Produkt classic = new Produkt("Classic Jazz");
        Produkt klippekort10 = new Produkt("Klippekort 10 klip");
        Produkt klippekort6 = new Produkt("Klippekort 6 klip");

        this.salg1 = new Salg(1);
        this.salg1.createSalgsLinje(kloster, 2, 40);

        this.salg2 = new Salg(2);
        this.salg2.createSalgsLinje(sweet, 3, 60);

        this.salg3 = new Salg(3);
        this.salg3.createSalgsLinje(extra, 2, 40);

        this.salg4 = new Salg(4);
        this.salg4.createSalgsLinje(classic, 3, 60);

        this.salg5 = new Salg(5);
        this.salg5.createSalgsLinje(klippekort10, 1, 160);

        this.salg6 = new Salg(6);
        this.salg6.createSalgsLinje(klippekort6, 2, 200);
    }

    @Test
    void addAndRemoveFirst() {
        //Act and assert
        deque.addFirst(salg1);
        deque.addFirst(salg2);
        deque.addFirst(salg3);
        deque.addFirst(salg4);
        deque.addFirst(salg5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            deque.addFirst(salg6);
        });

        Object currentSalg = deque.removeFirst();
        assertEquals(salg5, currentSalg);

        currentSalg = deque.removeFirst();
        assertEquals(salg4, currentSalg);

        currentSalg = deque.removeFirst();
        assertEquals(salg3, currentSalg);

        currentSalg = deque.removeFirst();
        assertEquals(salg2, currentSalg);

        currentSalg = deque.removeFirst();
        assertEquals(salg1, currentSalg);

        assertThrows(NoSuchElementException.class, () -> {
            deque.removeFirst();
        });
    }

    @Test
    void addFirstAndRemoveLast() {
        //Act and assert
        deque.addFirst(salg1);
        deque.addFirst(salg2);
        deque.addFirst(salg3);
        deque.addFirst(salg4);
        deque.addFirst(salg5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            deque.addFirst(salg6);
        });

        Object currentSalg = deque.removeLast();
        assertEquals(salg1, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg2, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg3, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg4, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg5, currentSalg);


        assertThrows(NoSuchElementException.class, () -> {
            deque.removeLast();
        });
    }

    @Test
    void addLast() {
        deque.addLast(salg1);
        deque.addLast(salg2);
        deque.addLast(salg3);
        deque.addLast(salg4);
        deque.addLast(salg5);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            deque.addLast(salg6);
        });

        Object currentSalg = deque.removeLast();
        assertEquals(salg5, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg4, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg3, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg2, currentSalg);

        currentSalg = deque.removeLast();
        assertEquals(salg1, currentSalg);

        assertThrows(NoSuchElementException.class, () -> {
            deque.removeLast();
        });
    }

    @Test
    void getFirst() {
        //Act & Assert
        Object actual;
        deque.addFirst(salg1);
        actual = deque.getFirst();
        assertEquals(salg1, actual);

        deque.addFirst(salg2);
        actual = deque.getFirst();
        assertEquals(salg2, actual);

        deque.addLast(salg3);
        actual = deque.getFirst();
        assertEquals(salg2, actual);

        deque.removeFirst();
        actual = deque.getFirst();
        assertEquals(salg1, actual);
    }

    @Test
    void getLast() {
        //Act & Assert
        Object actual;
        deque.addLast(salg1);
        actual = deque.getLast();
        assertEquals(salg1, actual);

        deque.addLast(salg2);
        actual = deque.getLast();
        assertEquals(salg2, actual);

        deque.addFirst(salg3);
        actual = deque.getLast();
        assertEquals(salg2, actual);

        deque.removeLast();
        actual = deque.getLast();
        assertEquals(salg1, actual);
    }

    @Test
    void size() {
        //Act and assert
        assertEquals(0, deque.size());

        deque.addFirst(salg1);
        assertEquals(1, deque.size());

        deque.addLast(salg2);
        assertEquals(2, deque.size());

        deque.removeFirst();
        assertEquals(1, deque.size());

        deque.removeLast();
        assertEquals(0, deque.size());
    }

    @Test
    void isEmpty() {
        // Act & Assert
        boolean actual = deque.isEmpty();
        assertEquals(true, actual);


        deque.addFirst(salg1);
        actual = deque.isEmpty();
        assertEquals(false, actual);

        deque.addLast(salg2);
        actual = deque.isEmpty();
        assertEquals(false, actual);

        deque.addFirst(salg3);
        actual = deque.isEmpty();
        assertEquals(false, actual);

        deque.addFirst(salg4);
        actual = deque.isEmpty();
        assertEquals(false, actual);

        deque.addLast(salg5);
        actual = deque.isEmpty();
        assertEquals(false, actual);

        deque.removeLast();
        deque.removeLast();
        deque.removeLast();
        deque.removeLast();
        deque.removeLast();

        actual = deque.isEmpty();
        assertEquals(true, actual);

    }
}



