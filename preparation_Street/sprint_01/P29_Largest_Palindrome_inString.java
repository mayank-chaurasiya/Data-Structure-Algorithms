package preparation_street.sprint_01;

import java.util.Scanner;

// Description: Write a program to find the largest palindrome in a given string.
public class P29_Largest_Palindrome_inString {
    private static String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        String longest = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd length palindrome
            String odd = expand(s, i, i);

            // Even length palindrome
            String even = expand(s, i, i + 1);

            if (odd.length() > longest.length()) {
                longest = odd;
            }

            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string : ");
        String str = sc.nextLine();
        System.out.println(longestPalindrome(str));
        sc.close();
    }
}
