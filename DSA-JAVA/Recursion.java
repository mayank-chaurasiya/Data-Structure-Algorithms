import java.util.*;

public class Recursion {
    public static void printNaturalNum(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        printNaturalNum(i + 1, n);
    }

    public static void revNaturalNum(int i, int n) {
        if (i < 1) {
            return;
        }
        System.out.print(i + " ");
        revNaturalNum(i - 1, n);
    }

    public static void sumNnumbers(int i, int sum) {
        if (i < 1) {
            System.out.print("sum = " + sum);
            return;
        }
        sumNnumbers(i - 1, sum + i);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // printNaturalNum(1, n);
        // revNaturalNum(n, n);
        // sumNnumbers(n, 0);
        // System.out.print("sum = " + sum(n));
        System.out.print("Factorial of " + n + " is : " + factorial(n));
        sc.close();
    }
}
