package labs.stacks_and_queues.linked_list;

public class LinkedList <T> {
    private Node <T> head;
    private int size;

    public LinkedList() {
        head = null;
    }

    public void append(T data) {
        if (head == null) {
            head = new Node <>(data);
            size++;

            return;
        }

        Node <T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node <>(data);
        size++;
    }

    public void prepend(T data) {
        Node <T> newHead = new Node <>(data);
        newHead.next = head;
        head = newHead;

        size++;
    }

    public T getHead() {
        return head.data;
    }

    public T getTail() {
        Node <T> current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public void removeByValue(T data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            size--;

            return;
        }

        Node <T> current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;

                return;
            }

            current = current.next;
        }
    }

    public T removeHead() {
        T result = head.data;

        head = head.next;
        size--;

        return result;
    }

    public T removeTail() {
        Node <T> current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        T result = current.data;

        current.next = null;
        size--;

        return result;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        Node <T> current = head;
        output.append(head.data);

        while (current.next != null) {
            current = current.next;
            output.append(" -> " + current.data);
        }

        return output.toString();
    }

    private class Node <K> {
        public Node <K> next;
        public K data;

        public Node(K data) {
            this.data = data;
        }
    }
}