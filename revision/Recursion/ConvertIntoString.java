package revision.Recursion;

public class ConvertIntoString {
    public static void convertNumToString(String str, int idx, StringBuilder s) {
        if (idx == str.length()) {
            System.out.print(s);
            return;
        }

        String[] arr = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

        int i = str.charAt(idx) - '0';

        convertNumToString(str, idx + 1, s.append(arr[i] + " "));
    }

    public static void main(String[] args) {
        String str = "2019";

        convertNumToString(str, 0, new StringBuilder(""));
    }
}
