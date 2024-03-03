package assignments.recursion;

public class Recursion {
    public static String removeX(String value) {
        if (value.length() == 0)
            return "";

        if (value.length() == 1) {
            if (value.toLowerCase().equals("x"))
                return "";
            else
                return value;
        }

        return removeX(value.substring(0, 1)) + removeX(value.substring(1));
    }

    public static int sumDigits(int value) {
        if (value < 10)
            return value;

        return (value % 10) + sumDigits(value / 10);
    }

    public static int countSubstring(String value, String subValue) {
        if (value.toLowerCase().contains(subValue.toLowerCase()))
            return 1 + countSubstring(value.replaceFirst("(?i)" + subValue, ""), subValue);

        return 0;
    }
}