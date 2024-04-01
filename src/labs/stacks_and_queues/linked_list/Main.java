package labs.stacks_and_queues.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedList <Integer> integerList = new LinkedList <>();

        integerList.append(5);
        integerList.append(3);
        integerList.append(6);

        integerList.prepend(1);
        integerList.prepend(8);

        printListDetails(integerList);

        System.out.println("Removeing 1...");
        integerList.removeByValue(1);
        printListDetails(integerList);

        System.out.println("Removeing head...");
        integerList.removeHead();
        printListDetails(integerList);

        System.out.println("Removeing tail...");
        integerList.removeTail();
        printListDetails(integerList);

        System.out.println("");
        LinkedList<String> stringList = new LinkedList<>();

        stringList.append("a");
        stringList.append("b");
        stringList.append("x");

        stringList.prepend("r");
        stringList.prepend("t");

        printListDetails(stringList);

        System.out.println("Removeing r...");
        stringList.removeByValue("r");
        printListDetails(stringList);

        System.out.println("Removeing head...");
        stringList.removeHead();
        printListDetails(stringList);

        System.out.println("Removeing tail...");
        stringList.removeTail();
        printListDetails(stringList);
    }

    public static void printListDetails(LinkedList list) {
        System.out.println("The list: " + list.toString());
        System.out.println("Size: " + list.size());
        System.out.println("Head: " + list.getHead());
        System.out.println("Tail: " + list.getTail());
    }
}
