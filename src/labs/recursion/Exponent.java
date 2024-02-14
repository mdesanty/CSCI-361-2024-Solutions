package labs.recursion;

public class Exponent {
    public static int exponentiate(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * exponentiate(base, exponent - 1);
    }
}
