package preparation_street.sprint_01;

import java.util.Scanner;

public class P40_Sum_OfDigits_tillSingle_Digit {
    public static int getSumTillSingle_Digit(int n) {
        while (n > 9) {
            int sum = 0;
            while (n > 0) {
                int lastDigit = n % 10;
                sum += lastDigit;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number: ");
        int number = scan.nextInt();
        System.out.print("Sum till single digit is : " + getSumTillSingle_Digit(number));
        scan.close();
    }
}
