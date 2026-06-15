package preparation_street.sprint_01;

import java.util.Scanner;

public class P37_Check_perfectSquare {
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        long left = 0;
        long right = n;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == n) {
                return true;
            } else if (square < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int n = scan.nextInt();
        System.out.println(n + " is perfect Square ? : " + isPerfectSquare(n));
        scan.close();
    }
}
