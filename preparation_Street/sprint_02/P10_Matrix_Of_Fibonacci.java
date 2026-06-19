package preparation_street.sprint_02;

import preparation_street.sprint_01.P42_Fibonacci_Sequence;

import java.util.Scanner;

public class P10_Matrix_Of_Fibonacci {
    public static void printFibonacciMtx(int rows) {
        int num = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(P42_Fibonacci_Sequence.FibonacciSeq(num) + " ");
                num++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter rows : ");
        int rows = scan.nextInt();
        printFibonacciMtx(rows);
        scan.close();
    }
}
