package labs.stacks_and_queues.int_linked_list;

public class Main {
    public static void main(String[] args) {
        /* Expected output:
         *
         * The list: 8 -> 1 -> 5 -> 3 -> 6
         * Size: 5
         * Head: 8
         * Tail: 6
         * Removeing 1...
         * The list: 8 -> 5 -> 3 -> 6
         * Size: 4
         * Head: 8
         * Tail: 6
         * Removeing head...
         * The list: 5 -> 3 -> 6
         * Size: 3
         * Head: 5
         * Tail: 6
         * Removeing tail...
         * The list: 5 -> 3
         * Size: 2
         * Head: 5
         * Tail: 3
         */

        LinkedList list = new LinkedList();

        list.append(5);
        list.append(3);
        list.append(6);

        list.prepend(1);
        list.prepend(8);

        printListDetails(list);

        System.out.println("Removeing 1...");
        list.removeByValue(1);
        printListDetails(list);

        System.out.println("Removeing head...");
        list.removeHead();
        printListDetails(list);

        System.out.println("Removeing tail...");
        list.removeTail();
        printListDetails(list);
    }

    public static void printListDetails(LinkedList list) {
        System.out.println("The list: " + list.toString());
        System.out.println("Size: " + list.size());
        System.out.println("Head: " + list.getHead());
        System.out.println("Tail: " + list.getTail());
    }
}