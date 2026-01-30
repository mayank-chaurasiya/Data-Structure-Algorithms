package revision.strings;

public class LowercaseVowels {
    public static int countLowercaseVowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "ApnaCollege";

        System.out.println(countLowercaseVowels(str));
    }
}
