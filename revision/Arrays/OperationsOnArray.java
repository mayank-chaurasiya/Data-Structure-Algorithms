import java.util.*;

public class OperationsOnArray {

    public static int largestElement(int arr[]) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int smallestElement(int arr[]) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // System.out.println("Largest element in array is : " + largestElement(arr) + "
    // and Smallest is : " + smallestElement(arr));

    public static int binarySearch(int arr[], int key) {
        Arrays.sort(arr);

        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // int key = sc.nextInt();
    // int result = binarySearch(arr, key);if(result==-1)
    // {
    // System.out.println("Not found");
    // }else
    // {
    // System.out.println("Found at index : " + result);
    // }

    public static void reverseArray(int arr[]) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;

            first++;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // reverseArray(arr);

    public static void pairsInArr(int arr[]) {
        int first = 0, last = arr.length - 1;
        for (int i = first; i <= last; i++) {
            for (int j = i + 1; j <= last; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // pairsInArr(arr);

    public static void printSubarray(int arr[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                StringBuilder sb = new StringBuilder();

                for (int k = i; k <= j; k++) {
                    sb.append(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.printf("%-15s sum is : %d%n", sb.toString(), sum);
                // System.out.println();
                // System.out.print(" sum is : " + sum);
                // System.out.println();

                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.print("Minimum is : " + min + "  ");
        System.out.print("Maximum is : " + max);

    }

    // printSubarray(arr);

    
    public static void main(String[] args) {
        // create
        int arr[] = { 2, 5, 8, 10, 30 };
        // Scanner sc = new Scanner(System.in);

        // sc.close();
    }
}
