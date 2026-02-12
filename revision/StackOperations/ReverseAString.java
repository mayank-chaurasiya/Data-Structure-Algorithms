// Reverse a string using stack
package revision.stackoperations;

import java.util.Stack;

public class ReverseAString {

    public static void reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            char current = s.pop();
            result.append(current);
        }

        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        reverseString("abcdef");
        // Stack<Character> s = new Stack<>();
        // String str = "abc";
        // for (int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);
        //     s.push(ch);
        // }
        // System.out.print("Reversed String is : ");
        // while (!s.isEmpty()) {
        //     System.out.print(s.pop());
        // }
    }
}
