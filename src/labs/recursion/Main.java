package labs.recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exponent:");
        System.out.println(Exponent.exponentiate(2, 4));
        System.out.println(Exponent.exponentiate(0, 3));
        System.out.println(Exponent.exponentiate(4, 0));
        System.out.println(Exponent.exponentiate(0, 0));

        System.out.println("\nFibonacci:");
        System.out.println(Fibonacci.getValue(1));
        System.out.println(Fibonacci.getValue(2));
        System.out.println(Fibonacci.getValue(3));
        System.out.println(Fibonacci.getValue(4));
        System.out.println(Fibonacci.getValue(5));
        System.out.println(Fibonacci.getValue(6));
        System.out.println(Fibonacci.getValue(7));
        System.out.println(Fibonacci.getValue(8));
        System.out.println(Fibonacci.getValue(9));

        /*
         * Exponent:
         * 16
         * 0
         * 1
         * 1
         *
         * Fibonacci:
         * 0
         * 1
         * 1
         * 2
         * 3
         * 5
         * 8
         * 13
         * 21
         */
    }
}
