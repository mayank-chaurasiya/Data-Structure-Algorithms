package preparation_street.sprint_01;

import java.util.Arrays;
import java.util.Scanner;

public class P32_Median_Of_Array {
    public static double findMedian(int arr[]) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Median of the array is : " + findMedian(arr));
        scan.close();
    }
}
