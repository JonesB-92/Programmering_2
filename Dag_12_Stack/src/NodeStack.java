import java.util.NoSuchElementException;

public class NodeStack implements StackI {
    private Node top;
    private int size = 0;

    // Intern klasse (fungerer lidt ligesom en wrapper) og intern, da man kun skal bruge den
    // inden i klassen og holder styr på strukturen
    class Node {
        Object data;
        Node next;
    }

    @Override
    public void push(Object element) {
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public Object pop() {
        if (top == null) {
            throw new NoSuchElementException();
        }

        Node oldTop = top;
        top = top.next;
        oldTop.next = null;
        size--;

        return oldTop.data;
    }

    @Override
    public Object peek() {
        if (top == null) {
            throw new NoSuchElementException();
        }
        return top.data;
    }

    //    @Override
    public int size1() {
        return size;
    }

    // På normal måde uden size variabel
    public int size() {
        Node currentNode = top;

        int size = 0;
        while (currentNode != null) {
            size++;
            currentNode = currentNode.next;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

}
