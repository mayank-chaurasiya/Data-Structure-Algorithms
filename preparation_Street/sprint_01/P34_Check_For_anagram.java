package preparation_street.sprint_01;

import java.util.Scanner;

public class P34_Check_For_anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter String_1 : ");
        String s1 = scan.nextLine();
        System.out.print("Enter String_2 : ");
        String s2 = scan.nextLine();

        s1 = s1.toLowerCase();
        s1 = s1.replaceAll("\\s+", "");

        s2 = s2.toLowerCase();
        s2 = s2.replaceAll("\\s+", "");

        System.out.println(s1 + " and " + s2 + " are anagrams ? " + isAnagram(s1, s2));
        scan.close();
    }
}