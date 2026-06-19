package preparation_street.sprint_02;

import java.util.Scanner;

public class P09_Largest_Prime_Factors {
    static int getLargestPrimeFactor(int n) {
        int max = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                if (max < i) {
                    max = i;
                }

                while (n % i == 0) {
                    n /= i;
                }
            }
        }
        if (n > 1) {
            max = n;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your Number : ");
        int num = scan.nextInt();
        System.out.print("Largest prime factor of " + num + " is : " + getLargestPrimeFactor(num));
        scan.close();
    }
}
