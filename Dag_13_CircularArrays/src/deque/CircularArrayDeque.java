package deque;

import java.util.NoSuchElementException;

public class CircularArrayDeque implements DequeI {
    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    /**
     * Constructs an empty queue.
     */
    public CircularArrayDeque(int size) {
        elements = new Object[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void addFirst(Object element) {
        int i;

        if (isEmpty()) {
            elements[head] = element;
        } else {
            // Vurderer, hvor i køen, der skal indsættes
            if (head != 0) { // Undgå out of bounds
                i = head - 1;
            } else {
                i = elements.length - 1; // Undgå out of bounds
            }

            // Indsætte data på fundet indeks, hvis indeks ikke optaget
            if (elements[i] == null) {
                elements[i] = element;
                head = i;
            } else { // (if ele[i] != null = array er fyldt)
                throw new IndexOutOfBoundsException("Circular array is full!");
            }
        }
        currentSize++;
    }

    @Override
    public void addLast(Object element) {
        int i;

        if (isEmpty()) {
            elements[tail] = element;
        } else {

            if (tail != elements.length - 1) {
                i = tail + 1;
            } else {
                i = 0;
            }

            // Indsætte data på fundet indeks, hvis indeks ikke optaget
            if (elements[i] == null) {
                elements[i] = element;
                tail = i;
            } else {
                throw new IndexOutOfBoundsException("Circular array is full!");
            }
        }
        currentSize++;
    }

    @Override
    public Object removeFirst() {
        Object removed = null;

        if (isEmpty()) {
            throw new NoSuchElementException("Circular array is empty!");
        } else {
            removed = elements[head];
            elements[head] = null; // Fjerner elementet på indekset

            if (head == elements.length - 1) { // Hvis på sidste plads, i arrayet kan vi ikke ++
                head = 0;
            } else {
                head++;
            }
        }
        currentSize--;
        return removed;
    }

    @Override
    public Object removeLast() {
        Object removed = null;

        if (isEmpty()) {
            throw new NoSuchElementException("Circular array is empty!");
        } else {
            removed = elements[tail];
            elements[tail] = null;

            if (tail == 0) {
                tail = elements.length - 1;
            } else {
                tail--;
            }
        }
        currentSize--;

        return removed;
    }

    @Override
    public Object getFirst() {
        return elements[head];
    }

    @Override
    public Object getLast() {
        return elements[tail];
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }
}
