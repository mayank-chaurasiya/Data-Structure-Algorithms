package revision.Backtracking;

public class FindSubsets {
    public static void getSubsets(String str, StringBuilder sb, int start) {
        if (start == str.length()) {
            if (sb.length() == 0) {
                System.out.print("null");
            } else {
                System.out.print(sb + " ");
            }
            return;
        }
        getSubsets(str, sb.append(str.charAt(start)), start + 1);
        sb.deleteCharAt(sb.length() - 1); // BackTracking -- undoing the append
        getSubsets(str, sb, start + 1);
    }

    public static void main(String[] args) {
        String str = "abc";

        getSubsets(str, new StringBuilder(), 0);
    }
}
