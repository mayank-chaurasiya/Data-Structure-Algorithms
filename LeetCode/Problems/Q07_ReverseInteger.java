package leetcode.problems;

public class Q07_ReverseInteger {
    public static int reverse(int x) {
        int revNum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                return 0;
            }
            revNum = (revNum * 10) + lastDigit;
            x = x / 10;
        }
        return revNum;
    }
    
    public static void main(String[] args) {
        System.out.println(reverse(76543));
    }
}
