package revision.queue;

import java.util.*;

// Leetcode - 387. First Unique Character in a String
public class FirstUniqueChar {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
        }
        if (q.isEmpty()) {
            System.out.println("No repeating characters!!");
        } else {
            System.out.println("First unique character is : " + q.peek());
        }
        // System.out.println();
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}
