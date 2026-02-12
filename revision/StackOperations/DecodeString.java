package revision.stackoperations;

import java.util.Stack;

// leetcode 394 - Decode A String
public class DecodeString {
    public static String decodeString(String str) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int count = 0;
        String curr = "";

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                count = count * 10 + (c - '0');
            } else if (c == '[') {
                countStack.push(count);
                stringStack.push(curr);
                count = 0;
                curr = "";
            } else if (c == ']') {
                StringBuilder decodedStr = new StringBuilder(stringStack.pop());
                int repeat = countStack.pop();

                for (int i = 1; i <= repeat; i++) {
                    decodedStr.append(curr);
                }
                curr = decodedStr.toString();
            } else {
                curr += c;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        String str = "2[a3[c2[x]]y]";
        System.out.print(decodeString(str));
    }
}
