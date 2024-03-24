package assignments.stacks_and_queues.array_queue;

public class Queue {
    private int size;
    private int capacity;
    private int[] items;
    private static final int FRONT_INDEX = 0;
    private int rearIndex;

    public Queue() {
        rearIndex = size = 0;
        capacity = 2;
        items = new int[capacity];
    }

    public void enqueue(int data) {
        if (rearIndex == capacity) {
            growArray();
        }

        items[rearIndex] = data;
        rearIndex++;
        size++;
    }

    public int dequeue() {
        if (isEmpty())
            return 0;

        int result = items[FRONT_INDEX];

        shiftItems();
        size--;

        return result;
    }

    public int front() {
        if (isEmpty())
            return 0;

        return items[FRONT_INDEX];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void growArray() {
        capacity *= 2;
        int[] newItems = new int[capacity];

        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }

    private void shiftItems() {
        for (int i = 0; i < size - 1; i++) {
            items[i] = items[i + 1];
        }
    }
}
