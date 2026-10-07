import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import bryghus.Produkt;
import bryghus.Salg;
import queue.CircularArrayQueue;
import queue.QueueI;

@TestMethodOrder(OrderAnnotation.class)
class QueueTest
{
    private QueueI queue;

    private Salg salg1;
    private Salg salg2;
    private Salg salg3;
    private Salg salg4;
    private Salg salg5;
    private Salg salg6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.queue = new CircularArrayQueue(5);

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
    @Order(1)
    void test_queue_canEnqueueAndDequeue()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        queue.enqueue(salg1);
        queue.enqueue(salg2);
        queue.enqueue(salg3);
        queue.enqueue(salg4);
        queue.enqueue(salg5);
        queue.enqueue(salg6);

        Salg salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg1, salgTilBehandling);

        salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg2, salgTilBehandling);

        salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg3, salgTilBehandling);

        salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg4, salgTilBehandling);

        salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg5, salgTilBehandling);

        salgTilBehandling = (Salg) queue.dequeue();
        assertEquals(salg6, salgTilBehandling);

        assertThrows(NoSuchElementException.class, () -> {
            queue.dequeue();
        });
    }

    @Test
    @Order(2)
    void test_queue_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertEquals(0, queue.size());

        queue.enqueue(salg1);
        assertEquals(1, queue.size());

        queue.enqueue(salg2);
        assertEquals(2, queue.size());

        queue.enqueue(salg3);
        assertEquals(3, queue.size());

        queue.enqueue(salg4);
        assertEquals(4, queue.size());

        queue.enqueue(salg5);
        assertEquals(5, queue.size());

        queue.enqueue(salg6);
        assertEquals(6, queue.size());

        queue.dequeue();
        assertEquals(5, queue.size());

        queue.dequeue();
        assertEquals(4, queue.size());

        queue.dequeue();
        assertEquals(3, queue.size());

        queue.dequeue();
        assertEquals(2, queue.size());

        queue.dequeue();
        assertEquals(1, queue.size());

        queue.dequeue();
        assertEquals(0, queue.size());
    }

    @Test
    @Order(3)
    void test_queue_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        assertTrue(queue.isEmpty());

        queue.enqueue(salg1);
        assertFalse(queue.isEmpty());

        queue.enqueue(salg2);
        assertFalse(queue.isEmpty());

        queue.enqueue(salg3);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
