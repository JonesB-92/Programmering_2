public interface DropOutStackI {
    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    public void push(Object element);

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     */
    public Object pop();
    /**
     * Returns the element from the top of the stack. The stack is unchanged.
     *
     * @return the element from the top of the stack
     */
    public Object peek();

    /**
     * The number of elements on the stack.
     *
     * @return the number of elements on the stack
     */
    public int size();



    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty();
}
