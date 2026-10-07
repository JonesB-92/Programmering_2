package queue;

import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a linked list.
 */
public class NodeQueue implements QueueI {
    private Node head;
    private Node tail;
    private int size;


    class Node {
        public Object data;
        public Node next;
    }

    /**
     * Constructs an empty queue.
     */
    public NodeQueue() {
        // TODO: Assignment 1: Implement this constructor...
    }

    @Override
    public void enqueue(Object element) {
        Node current = head;
        Node newNode = new Node(); // Har ingen node, som det nye element skal hæftes til
        newNode.data = element;

        if (head == null) { // Avoider nullpointer exception
            head = newNode;
        } else {
            // Nye element skal tilsættes tail, så vi løber hele køen igennem, til vi er på sidste 'index'
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node oldHead = head;
        head = head.next;
        oldHead.next = null;
        size--;

        return oldHead.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
}
