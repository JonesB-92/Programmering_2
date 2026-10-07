package queue;

public interface QueueI
{
    /**
     * Adds an element to the tail of this queue.
     * 
     * @param element the element to add
     */
    void enqueue(Object element);

    /**
     * Removes an element from the head of this queue.
     * 
     * @return the removed element
     */
    Object dequeue();

    /**
     * The number of elements in this queue.
     *
     * @return the number of elements in this queue
     */
    public int size();

    /**
     * Checks whether this queue is empty.
     * 
     * @return true if this queue is empty
     */
    boolean isEmpty();
}
