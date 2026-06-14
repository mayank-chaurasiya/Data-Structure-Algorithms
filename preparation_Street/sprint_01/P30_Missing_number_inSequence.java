package preparation_street.sprint_01;

import java.util.Scanner;

//Description: Write a program to find missing numbers in a sequence from 1 to n.

public class P30_Missing_number_inSequence {
    public static int findMissing(int arr[], int n) {
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter size : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.print("missing no. from sequence is : " + findMissing(arr, arr[arr.length - 1]));
        scan.close();
    }
}
