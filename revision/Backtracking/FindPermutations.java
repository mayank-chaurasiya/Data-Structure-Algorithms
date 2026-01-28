package revision.backtracking;
public class FindPermutations {
    public static void getPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);

            String remaining = str.substring(0, j) + str.substring(j + 1);

            getPermutations(remaining, ans + ch);
        }

    }

    public static void main(String[] args) {
        String str = "abc";

        getPermutations(str, "");
    }
}
