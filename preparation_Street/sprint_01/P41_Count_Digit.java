package preparation_street.sprint_01;

import java.util.Scanner;

public class P41_Count_Digit {
    public static int countDigit(int number, int d) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;
            if (digit == d) {
                count++;
            }
            number /= 10;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scan.nextInt();
        System.out.print("digit to find : ");
        int d = scan.nextInt();
        System.out.printf("count of %d in %d is %d", d, number, countDigit(number, d));
        scan.close();
    }
}
