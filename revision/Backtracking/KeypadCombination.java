package revision.backtracking;
public class KeypadCombination {

    final static char[][] L = { {}, {}, { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' },
            { 'm', 'n', 'o' }, { 'p', 'q', 'r', 's' }, { 't', 'u', 'v' }, { 'w', 'x', 'y', 'z' } };

    public static void letterCombinations(String s) {
        int length = s.length();

        if (length == 0) {
            System.out.println("");
            return;
        }
        bfs(0, length, new StringBuilder(), s);
    }

    public static void bfs(int position, int length, StringBuilder sb, String s) {
        if (position == length) {
            System.out.print(sb.toString() + " ");
        } else {
            char[] letters = L[Character.getNumericValue(s.charAt(position))];
            for (int i = 0; i < letters.length; i++) {
                bfs(position + 1, length, new StringBuilder(sb).append(letters[i]), s);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("234");
    }
}
