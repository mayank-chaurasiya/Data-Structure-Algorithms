import java.lang.Math;

public class P4_nth_Armstrong_number {
    static int NthArmstrong(int n) {
        int count = 0;

        // upper limit from integer
        for (int i = 1; i <= Integer.MAX_VALUE; i++) {
            int num = i, rem, digit = 0, sum = 0;

            // copy the value for num in temp variable
            num = i;

            // find total digits in num
            digit = (int) Math.log10(num) + 1;

            // Calculate sum of power of digits
            while (num > 0) {
                rem = num % 10;
                sum = sum + (int) Math.pow(rem, digit);
                num = num / 10;
            }

            // check for Armstrong number
            if (i == sum) {
                count++;
            }
            if (count == n) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(NthArmstrong(n));
    }
}
