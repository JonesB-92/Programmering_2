package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayQueue implements QueueI
{
    private Object[] elements;
    private int currentSize;
    private int head;
    private int tail;

    /**
     * Constructs an empty queue.
     */
    public CircularArrayQueue(int size)
    {
        elements = new Object[size];
        currentSize = 0;
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(Object element)
    {
        growIfNecessary();
        currentSize++;
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
    }

    @Override
    public Object dequeue()
    {
        if (currentSize == 0)
        {
            throw new NoSuchElementException();
        }
        Object removed = elements[head];
        head = (head + 1) % elements.length;
        currentSize--;
        return removed;
    }

    @Override
    public int size()
    {
        return currentSize;
    }

    @Override
    public boolean isEmpty()
    {
        return currentSize == 0;
    }

    /**
     * Grows the element array if the current size equals the capacity.
     */
    private void growIfNecessary()
    {
        if (currentSize == elements.length)
        {
            Object[] newElements = new Object[2 * elements.length];
            for (int i = 0; i < elements.length; i++)
            {
                newElements[i] = elements[(head + i) % elements.length];
            }
            elements = newElements;
            head = 0;
            tail = currentSize;
        }
    }
}
