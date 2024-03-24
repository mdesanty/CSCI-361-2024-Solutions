package assignments.stacks_and_queues.array_stack;

public class Stack {
    private int capacity;
    private int size;
    private int[] items;

    public Stack() {
        size = 0;
        capacity = 2;
        items = new int[capacity];
    }

    public void push(int n) {
        if (size == capacity)
            growArray();

        items[size] = n;
        size++;
    }

    public int pop() {
        int result = items[currentIndex()];

        items[currentIndex()] = 0;
        size--;

        return result;
    }

    public int top() {
        return items[currentIndex()];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    private void growArray() {
        capacity *= 2;
        int[] newItems = new int[capacity];

        for (int i = 0; i < size; i++) {
            newItems[i] = items[i];
        }

        items = newItems;
    }

    private int currentIndex() {
        return size - 1;
    }
}
