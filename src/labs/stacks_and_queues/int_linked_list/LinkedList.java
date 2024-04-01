package labs.stacks_and_queues.int_linked_list;

public class LinkedList {
    Node head;
    int size;

    public LinkedList() {
        head = null;
    }

    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            size++;

            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(data);
        size++;
    }

    public void prepend(int data) {
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;

        size++;
    }

    public int getHead() {
        return head.data;
    }

    public int getTail() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        return current.data;
    }

    public int size() {
        return size;
    }

    public void removeByValue(int data) {
        if (head == null) { return; }
        if (head.data == data) {
            head = head.next;
            size--;

            return;
         }

         Node current = head;
         while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;

                return;
            }

            current = current.next;
         }
    }

    public int removeHead() {
        int result = head.data;

        head = head.next;
        size--;

        return result;
    }

    public int removeTail() {
        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        int result = current.data;

        current.next = null;
        size--;

        return result;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        Node current = head;
        output.append(head.data);

        while (current.next != null) {
            current = current.next;
            output.append(" -> " + current.data);
        }

        return output.toString();
    }

    private class Node {
        public Node next;
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }
}