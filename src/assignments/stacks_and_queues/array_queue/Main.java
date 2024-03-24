package assignments.stacks_and_queues.array_queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(8);
        queue.enqueue(6);
        queue.enqueue(3);
        queue.enqueue(5);
        printQueueDetails(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        printQueueDetails(queue);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Dequeue: " + queue.dequeue());
        printQueueDetails(queue);
    }

    private static void printQueueDetails(Queue queue) {
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());
    }
}