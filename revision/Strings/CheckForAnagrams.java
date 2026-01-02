package revision.Strings;

import java.util.Arrays;

public class CheckForAnagrams {
    public static String sortString(String inpuString) {
        char[] charArray = inpuString.toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);
    }

    public static void main(String[] args) {
        String str1 = "race", str2 = "cade";

        String sortedString1 = sortString(str1), sortedString2 = sortString(str2);

        if (sortedString1.equals(sortedString2)) {
            System.out.print(str1 + " & " + str2 + " are anagrams");
        } else {
            System.out.print(str1 + " & " + str2 + " are not anagrams");
        }
    }
}
