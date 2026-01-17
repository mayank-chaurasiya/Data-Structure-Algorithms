package GFG.Arrays;

public class SecondLargestElement {
    public static int getScndLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int scndLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                scndLargest = largest;
                largest = arr[i];
            } else if (arr[i] > scndLargest && arr[i] != largest) {
                scndLargest = arr[i];
            }
        }
        return scndLargest;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        System.out.print(getScndLargest(arr));
    }
}
