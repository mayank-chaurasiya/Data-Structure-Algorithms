package preparation_street.sprint_01;

import java.util.Scanner;

public class P33_Power_Of_Num {
    public static long power(long base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result *= base;
            }
            base *= base;
            exponent /= 2;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the base : ");
        long base = scan.nextLong();
        System.out.print("Enter the exponent : ");
        int exponent = scan.nextInt();
        System.out.println(base + " to the power of " + exponent + " is : " + power(base, exponent));
        scan.close();
    }
}
