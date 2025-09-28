// write a program to generate the fibonacci series up to a given number.

import java.util.Scanner;

public class P5_Fibonacci_Series {

    // print fibonacci series for the nth terms
    static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    static void fibonacciSeries(int n) {
        int currTerm = 0, secondTerm = 1;
        while(currTerm <= n) {
            System.out.print(currTerm + " ");
            int nextTerm = currTerm + secondTerm;
            currTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    static void fibonacciSeries2(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series: " + firstTerm + " " + secondTerm);

        for(int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        // int n = 10;
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibonacci(i) + " ");
        // }

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scan.nextInt();

        System.out.println("fibonacci series up to " + n + ": ");
        fibonacciSeries(n);
        scan.close();
    }
}
