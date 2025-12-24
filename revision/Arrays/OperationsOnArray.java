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

    public static void main(String[] args) {
        // create
        int arr[] = { 2, 5, 8, 10, 30 };
        reverseArray(arr);
        // Scanner sc = new Scanner(System.in);

        // sc.close();
    }
}
