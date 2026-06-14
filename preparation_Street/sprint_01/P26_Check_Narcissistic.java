// Description: Write a program to check if a number is a narcissistic number
// (where the sum of its digits raised to the power of the number of digits
// equals the number itself).

package preparation_street.sprint_01;

import java.util.*;

public class P26_Check_Narcissistic {
    public static boolean checkNarcissistic(int num) {
        int total_digits = P25_Number_of_Digits.countDigits(num), newNum = 0, n = num;
        while (n != 0) {
            int digit = n % 10;
            newNum = newNum + (int) Math.pow(digit, total_digits);
            n = n / 10;
        }

        if (newNum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println(num + " is narcissitic number ? " + checkNarcissistic(num));
        sc.close();
    }
}