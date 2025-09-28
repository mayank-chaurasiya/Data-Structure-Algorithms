// write a program to check if a string or number is a palindrom ?
public class P6_palindrome_string {
    public static boolean isPalindrome(String str) {
        String reverse = "";

        boolean ans = false;

        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)) {
             ans = true;
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "car";

        str = str.toLowerCase();
        boolean A = isPalindrome(str);
        System.out.println(A);
    }
}
