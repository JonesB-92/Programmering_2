import java.util.NoSuchElementException;
/**
 * An implementation of a stack as an array of objects.
 */
public class ArrayStack implements StackI {
    private Object[] stack;
    private int top;

    /**
     * Constructs an empty stack.
     */
    public ArrayStack(int size) {
        top = -1;
        stack = new Object[size];
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    @Override
    public void push(Object element) {
        growIfNecassary();
        top++;
        stack[top] = element;

    }

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     */
    @Override
    public Object pop() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    /**
     * Returns the element from the top of the stack. The stack is unchanged
     *
     * @return the element from the top of the stack
     */
    @Override
    public Object peek() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    /**
     * The number of elements on the stack.
     *
     * @return the number of elements on the stack
     */
    @Override
    public int size() {
        return top + 1;
    }

    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    private void growIfNecassary() {
        if (top + 1 == stack.length) {
            Object[] newElements = new Object[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newElements[i] = stack[i];
            }
            stack = newElements;
        }
    }
}
