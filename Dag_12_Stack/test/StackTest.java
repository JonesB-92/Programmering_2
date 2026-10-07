import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class StackTest
{
    private StackI stack;

    private Card card1;
    private Card card2;
    private Card card3;
    private Card card4;
    private Card card5;
    private Card card6;

    @BeforeEach
    void setUp() throws Exception
    {
        // --------------------------------------------------
        // ARRANGE
        // --------------------------------------------------

        this.stack = new NodeStack();

        this.card1 = new Card("Spade", "Jack");
        this.card2 = new Card("Club", "2");
        this.card3 = new Card("Heart", "3");
        this.card4 = new Card("Heart", "4");
        this.card5 = new Card("Diamond", "5");
        this.card6 = new Card("Diamond", "6");
    }

    @Test
    @Order(1)
    void test_stack_canPushAndPop()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        stack.push(card1);
        stack.push(card2);
        stack.push(card3);
        stack.push(card4);
        stack.push(card5);
        stack.push(card6);

        Card cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card6, cardPopped);

        cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card5, cardPopped);

        cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card4, cardPopped);

        cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card3, cardPopped);

        cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card2, cardPopped);

        cardPopped = (Card) stack.pop();
        Assertions.assertEquals(card1, cardPopped);

        Assertions.assertThrows(NoSuchElementException.class, () -> {
            stack.pop();
        });
    }

    @Test
    @Order(2)
    void test_stack_canPeek()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        stack.push(card1);
        Card cardPeeked = (Card) stack.peek();
        Assertions.assertEquals(card1, cardPeeked);

        stack.push(card2);
        cardPeeked = (Card) stack.peek();
        Assertions.assertEquals(card2, cardPeeked);

        stack.push(card3);
        cardPeeked = (Card) stack.peek();
        Assertions.assertEquals(card3, cardPeeked);

        stack.pop();
        cardPeeked = (Card) stack.peek();
        Assertions.assertEquals(card2, cardPeeked);

        stack.pop();
        cardPeeked = (Card) stack.peek();
        Assertions.assertEquals(card1, cardPeeked);

        stack.pop();
        Assertions.assertThrows(NoSuchElementException.class, () -> {
            stack.peek();
        });
    }

    @Test
    @Order(3)
    void test_stack_returnsIsEmpty()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        Assertions.assertTrue(stack.isEmpty());

        stack.push(card1);
        Assertions.assertFalse(stack.isEmpty());

        stack.push(card2);
        Assertions.assertFalse(stack.isEmpty());

        stack.push(card3);
        Assertions.assertFalse(stack.isEmpty());

        stack.pop();
        Assertions.assertFalse(stack.isEmpty());

        stack.pop();
        Assertions.assertFalse(stack.isEmpty());

        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    @Order(4)
    void test_stack_returnsSize()
    {
        // --------------------------------------------------
        // ACT & ASSERT
        // --------------------------------------------------

        Assertions.assertEquals(0, stack.size());

        stack.push(card1);
        Assertions.assertEquals(1, stack.size());

        stack.push(card2);
        Assertions.assertEquals(2, stack.size());

        stack.push(card3);
        Assertions.assertEquals(3, stack.size());

        stack.push(card4);
        Assertions.assertEquals(4, stack.size());

        stack.push(card5);
        Assertions.assertEquals(5, stack.size());

        stack.push(card6);
        Assertions.assertEquals(6, stack.size());

        stack.pop();
        Assertions.assertEquals(5, stack.size());

        stack.pop();
        Assertions.assertEquals(4, stack.size());

        stack.pop();
        Assertions.assertEquals(3, stack.size());

        stack.pop();
        Assertions.assertEquals(2, stack.size());

        stack.pop();
        Assertions.assertEquals(1, stack.size());

        stack.pop();
        Assertions.assertEquals(0, stack.size());
    }

    class Card
    {
        public String symbol;
        public String ranking;

        public Card(String symbol, String ranking)
        {
            super();
            this.symbol = symbol;
            this.ranking = ranking;
        }

        @Override
        public String toString()
        {
            return this.symbol + ": " + this.ranking;
        }
    }
}
