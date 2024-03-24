package assignments.stacks_and_queues.array_stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(8);
        stack.push(4);
        stack.push(6);
        stack.push(1);
        stack.push(3);

        System.out.println(stack.size());
        System.out.println(stack.top());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
        System.out.println(stack.top());
    }
}
