import java.util.NoSuchElementException;

public class ArrayDropOutStack implements DropOutStackI {
    private Object[] stack;
    private int top;
    private int bot;

    /**
     * Constructs an empty stack.
     */
    public ArrayDropOutStack(int size) {
        top = -1;
        bot = -1;
        stack = new Object[size];
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    @Override
    public void push(Object element) {
        if (isEmpty()) {
            bot++;
            stack[bot] = element;
            top++;
            stack[top] = element;
        } else {
            throwIfNeccassary();
            top++;
            stack[top] = element;
        }
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
        stack[top] = null; // Toppen som nu er blevet taget ud er blevet sat til null
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


    // Når stakken indeholder n elementer, ”droppes” det 1. element, når det (n+1)’te
    //element indsættes.
    private void throwIfNeccassary() {
        if (top + 1 == stack.length) {
            for (int i = 0; i < stack.length - 1; i++) {
                stack[i] = stack[i + 1];
            }
        }
        top++;
    }
}
