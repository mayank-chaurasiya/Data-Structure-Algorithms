package revision.Recursion;

public class ConvertIntoString {

    static String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

    public static void convertNumToString(String str, int idx, StringBuilder s) {
        if (idx == str.length()) {
            System.out.print(s);
            return;
        }

        int i = str.charAt(idx) - '0';

        convertNumToString(str, idx + 1, s.append(digits[i] + " "));
    }

    public static void printDigits(int number) {
        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigit] + " ");
    }

    public static void main(String[] args) {
        // String str = "2019";
        // convertNumToString(str, 0, new StringBuilder(""), digits);

        printDigits(1234);
    }
}
