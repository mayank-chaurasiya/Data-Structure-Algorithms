package preparation_street.sprint_01;

import java.util.Scanner;

// Description: Write a program to generate number patterns (e.g., sequential numbers in a matrix).
public class P27_pattern_of_numbers {
    public static void printNumericPattern(int rows) {
        int n = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = sc.nextInt();
        printNumericPattern(rows);
        sc.close();
    }
}