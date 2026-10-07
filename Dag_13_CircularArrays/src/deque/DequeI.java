package deque;

public interface DequeI {
    /**
     * Adds an element to the head of this deque.
     *
     * @param element the element to add
     */
    public void addFirst(Object element);

    /**
     * Adds an element to the tail of this deque.
     *
     * @param element the element to add
     */
    public void addLast(Object element);

    /**
     * Removes an element from the head of this deque.
     *
     * @return the removed element
     */
    public Object removeFirst();

    /**
     * Removes an element from the tail of this deque.
     *
     * @return the removed element
     */
    public Object removeLast();

    /**
     * Returns the head of this deque. The deque is unchanged.
     *
     * @return the head element
     */
    public Object getFirst();

    /**
     * Returns the tail of this deque. The deque is unchanged.
     *
     * @return the tail element
     */
    public Object getLast();

    /**
     * The number of elements on the deque.
     *
     * @return the number of elements on the queue
     */
    public int size();

    /**
     * Checks whether this deque is empty.
     *
     * @return true if this queue is empty
     */
    public boolean isEmpty();
}
