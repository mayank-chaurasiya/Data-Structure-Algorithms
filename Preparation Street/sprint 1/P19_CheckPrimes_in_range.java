import java.util.Scanner;

public class P19_CheckPrimes_in_range {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting of interval : ");
        int start = scan.nextInt();

        System.out.println("Enter the ending of the interval : ");
        int end = scan.nextInt();

        System.out.println("Primes in range of " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
