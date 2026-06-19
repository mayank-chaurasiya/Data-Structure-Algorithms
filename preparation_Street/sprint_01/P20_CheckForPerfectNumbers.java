package preparation_street.sprint_01;

import java.util.Scanner;

public class P20_CheckForPerfectNumbers {
    public static boolean checkPerfectNumber(long n) {
        int i = 1;
        long sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.print(n + " ");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        long n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scan.nextLong();
        System.out.println(checkPerfectNumber(n));
        scan.close();
    }
}
