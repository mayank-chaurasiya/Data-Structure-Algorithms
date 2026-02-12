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

    public static void maxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println("Maximum sum is : " + maxSum);
    }

    // maxSubarraySum(arr);

    public static void maxSubArrSum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // calculate prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum is : " + maxSum);
    }

    // maxSubArrSum(arr);

    // kadane's Algorithm to find max sum in the subarray ----------
    public static void maxSumKadanes(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum < 0) {
                currSum = 0;
            }

            maxSum = Math.max(maxSum, currSum);
        }

        System.out.println("Max sum is : " + maxSum);
    }

    // maxSumKadanes(arr);
    
    // function to calculate max sum of the array with mixed elements -------------
    public static int maxSumMixedArr(int arr[]) {
        int overallMax = arr[0];
        int currMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            currMax = Math.max(num, currMax + num);
            overallMax = Math.max(overallMax, currMax);
        }
        return overallMax;
    }

    // System.out.println("Max sum of the given array is : " + maxSumMixedArr(arr));

    public static void main(String[] args) {
        // create
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        maxSubArrSum(arr);
        // Scanner sc = new Scanner(System.in);

        // sc.close();
    }
}
