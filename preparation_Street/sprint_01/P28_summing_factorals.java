package preparation_street.sprint_01;

import java.util.Scanner;

//Description: Write a program to find the sum of the digits of the factorial of a given number.

public class P28_summing_factorals {
    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    public static int sumDigitOfFactorial(int n) {
        int factorial = getFactorial(n), sum = 0;

        while (factorial != 0) {
            int digit = factorial % 10;
            sum += digit;
            factorial /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        System.out.println("factorial of " + n + " is " + getFactorial(n) + " and sum of the factorial is "
                + sumDigitOfFactorial(n));
        sc.close();
    }
}
