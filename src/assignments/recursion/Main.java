package assignments.recursion;

public class Main {
    public static void main(String[] args) {
        String removeXTest = "HaxxedHeXX";
        System.out.println(String.format("removeX: %s => %s", removeXTest, Recursion.removeX(removeXTest)));

        removeXTest = "Already no letter";
        System.out.println(String.format("removeX: %s => %s", removeXTest, Recursion.removeX(removeXTest)));

        int sumDigitsTest = 1403;
        System.out.println(String.format("sumDigits(%s): %s", sumDigitsTest, Recursion.sumDigits(sumDigitsTest)));

        sumDigitsTest = 4;
        System.out.println(String.format("sumDigits(%s): %s", sumDigitsTest, Recursion.sumDigits(sumDigitsTest)));

        String string = "Catwoman loves cAts";
        String subString = "caT";
        System.out.println(String.format("countSubstring(%s, %s): %s", string, subString, Recursion.countSubstring(string, subString)));

        string = "aaa book";
        subString = "aa";
        System.out.println(String.format("countSubstring(%s, %s): %s", string, subString, Recursion.countSubstring(string, subString)));
    }
}
