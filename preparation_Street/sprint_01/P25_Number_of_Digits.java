// Description: Write a program to count the number of digits in a given number.
package preparation_street.sprint_01;

import java.util.Scanner;

public class P25_Number_of_Digits {
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you number : ");
        int num = sc.nextInt();

        System.out.println("Total digits : " + countDigits(num));
        sc.close();
    }
}