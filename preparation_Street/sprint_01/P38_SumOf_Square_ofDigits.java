package preparation_street.sprint_01;

import java.util.Scanner;

public class P38_SumOf_Square_ofDigits {
    public static int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digits = n % 10;
            sum += digits * digits;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = scan.nextInt();
        System.out.println("Sum of the square of digits in Number : " + getSquareSum(number));
        scan.close();
    }
}
