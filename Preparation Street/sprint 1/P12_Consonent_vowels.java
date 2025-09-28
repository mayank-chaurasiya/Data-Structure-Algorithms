public class P12_Consonent_vowels {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0, totalChars = 0;
        String str = "This is really a simple structure";
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                totalChars++;
            }
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                cCount++;
            }
        }

        System.out.println("Total number of characters in the string : " + totalChars);
        System.out.println("Number of vowels : " + vCount);
        System.out.println("Number of consonants : " + cCount);
    }
}
