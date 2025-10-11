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

    public static void fact(int n) {
        int factorial = 1;
        if (n == 0 || n == 1) {
            System.out.print(factorial);
            return;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }

    static void printArray(int ans[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    // Function to reverse array using an auxiliary array
    static void reverseArray(int arr[], int n) {
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[n - i - 1] = arr[i];
        }
        printArray(ans, n);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // printNaturalNum(1, n);
        // revNaturalNum(n, n);
        // sumNnumbers(n, 0);
        // System.out.print("sum = " + sum(n));
        // System.out.print("Factorial of " + n + " is : " + factorial(n));
        // fact(n);
        int n = 5;
        int arr[] = { 8, 7, 5, 9, 10};
        reverseArray(arr, n);
        // sc.close();
    }
}
