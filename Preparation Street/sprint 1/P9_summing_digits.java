// write a program to sum the digits of a number

import java.util.Scanner;

public class P9_summing_digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scan.nextInt();
        scan.close();
        // int n = 12345;
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits is " + sum);
    }
}
