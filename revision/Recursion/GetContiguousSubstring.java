package revision.recursion;

// import java.util.ArrayList;
// import java.util.List;

public class GetContiguousSubstring {
    // public static List<String> getAllSubstrings(String str) {
    // List<String> substrings = new ArrayList<>();
    // for (int i = 0; i < str.length(); i++) {
    // for (int j = i + 1; j <= str.length(); j++) {
    // substrings.add(str.substring(i, j));
    // }
    // }
    // return substrings;
    // }

    // public static int countSubstring(List<String> substrings, int index) {
    // if (index == substrings.size()) {
    // return 0;
    // }

    // String current = substrings.get(index);
    // int count = 0;

    // if (current.length() > 0 &&
    // current.charAt(0) == current.charAt(current.length() - 1)) {
    // count = 1;
    // }

    // // Recursive call
    // return count + countSubstring(substrings, index + 1);
    // }

    public static int countSubstrings(String str, int start, int end) {
        // Base case: all starting positions processed
        if (start == str.length()) {
            return 0;
        }

        // If end goes out of bounds, move start forward
        if (end == str.length()) {
            return countSubstrings(str, start + 1, start + 1);
        }

        int count = 0;

        // Check current substring [start, end]
        if (str.charAt(start) == str.charAt(end)) {
            count = 1;
        }

        // Expand end
        return count + countSubstrings(str, start, end + 1);
    }

    public static void main(String[] args) {
        String str = "abcab";
        System.out.println(countSubstrings(str, 0, 0));
    }
}

// public static void main(String[] args) {
// String str = "abcab";

// // System.out.println(countSubstring(getAllSubstrings(str), 0));
// }
