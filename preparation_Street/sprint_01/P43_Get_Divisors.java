package preparation_street.sprint_01;

import java.util.Scanner;

public class P43_Get_Divisors {
    public static void getDivisors(int num) {
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                // if (i != num / i) {
                // System.out.print(num / i + " ");
                // }
            }
        }
        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
            if (num % i == 0) {
                if (i == num / i)
                    continue;

                System.out.print(num / i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = scan.nextInt();
        getDivisors(n);
        scan.close();
    }
}
