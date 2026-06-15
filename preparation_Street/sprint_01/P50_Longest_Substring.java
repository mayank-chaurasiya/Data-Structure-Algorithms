package preparation_street.sprint_01;

import java.util.HashSet;
import java.util.Set;

public class P50_Longest_Substring {
    public static String longestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLen = 0;
        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            if (right - left + 1 > maxLen) {
                maxLen = right - left + 1;
                start = left;
            }
        }

        return s.substring(start, start + maxLen);
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("abcabcbb"));
    }
}
