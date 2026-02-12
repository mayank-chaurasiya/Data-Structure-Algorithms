package revision.stackoperations;

// leetcode 71 - simplify path
import java.util.Stack;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // ignore
                continue;
            } else if (part.equals("..")) {
                // go to parent directory
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // valid directory name
                stack.push(part);
            }
        }

        // build result
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {
        String path = "/apna/..";
        System.out.print(simplifyPath(path));
    }
}
