package revision.strings;

public class CheckForPalindrome {
    public static boolean isPalindrome(String s) {

        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        if (s.equals(reverse)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "raceAcar";

        s = s.toLowerCase();

        System.out.println(isPalindrome(s));
    }
}
