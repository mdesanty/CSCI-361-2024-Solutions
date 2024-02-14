package labs.recursion;

public class Fibonacci {
    public static int getValue(int position) {
        if (position == 1) return 0;
        if (position == 2) return 1;

        return getValue(position - 2) + getValue(position -1);
    }
}
