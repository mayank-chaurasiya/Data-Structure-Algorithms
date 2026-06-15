package preparation_street.sprint_01;

import java.util.Scanner;

public class P35_SumOf_Primes_inRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the starting of interval : ");
        int start = scan.nextInt();

        System.out.print("Enter the ending of the interval : ");
        int end = scan.nextInt();

        int total = 0;

        System.out.print("Primes in range of " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                total += i;
            }
        }
        System.out.println("\nTotal of all the Primes above is : " + total);
        scan.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
