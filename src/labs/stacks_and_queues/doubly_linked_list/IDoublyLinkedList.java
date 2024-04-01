package labs.stacks_and_queues.doubly_linked_list;

public interface IDoublyLinkedList <T> {
    public void append(T data);

    public void prepend(T data);

    public T getHead();

    public T getTail();

    public T removeHead();

    public T removeTail();

    public void removeByValue(T data);

    public int size();

    public boolean isEmpty();
}