import java.util.Stack;

public class P13_Reverseing_string {
    // Reversing a string using StringBuilder
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    // Reversing a string using for loop
    public static String revString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // Reversing a string using Stack
    public static String revStringStack(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "programming";
        System.out.println(reverseString(str));
        System.out.println(revString(str));
        System.out.println(revStringStack(str));
    }
}
