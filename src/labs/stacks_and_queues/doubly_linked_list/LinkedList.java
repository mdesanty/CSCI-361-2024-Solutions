package labs.stacks_and_queues.doubly_linked_list;

public class LinkedList <T> implements IDoublyLinkedList <T> {
    private Node <T> head;
    private Node <T> tail;
    private int size;

    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public void append(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            newNode.previous = tail;
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public void prepend(T data) {
        Node <T> newNode = new Node <>(data);

        if (head == null) {
            head = tail = newNode;
        }
        else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }

        size++;
    }

    @Override
    public T getHead() {
        if (head == null) {
            return null;
        }

        return head.data;
    }

    @Override
    public T getTail() {
        if (tail == null) {
            return null;
        }

        return tail.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void removeByValue(T data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            head.previous = null;

            size--;

            return;
        }

        Node <T> current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                if (current.next.next != null) {
                    current.next.next.previous = current;
                }

                current.next = current.next.next;
                size--;

                return;
            }

            current = current.next;
        }
    }

    @Override
    public T removeHead() {
        T result = head.data;

        head = head.next;

        if (head != null)
            head.previous = null;

        size--;

        return result;
    }

    @Override
    public T removeTail() {
        T result = tail.data;

        tail = tail.previous;

        if (tail != null)
            tail.next = null;

        size--;

        return result;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        Node <T> current = head;

        if (head != null) {
            output.append(head.data);

            while (current.next != null) {
                current = current.next;
                output.append(" -> " + current.data);
            }
        }

        return output.toString();
    }

    private class Node <K> {
        public Node <K> next;
        public Node <K> previous;
        public K data;

        public Node(K data) {
            this.data = data;
        }
    }
}