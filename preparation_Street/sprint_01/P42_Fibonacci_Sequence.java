package preparation_street.sprint_01;

import java.util.Scanner;

public class P42_Fibonacci_Sequence {
    public static int FibonacciSeq(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return FibonacciSeq(n - 2) + FibonacciSeq(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(FibonacciSeq(i) + " ");
        }
        scan.close();
    }
}
