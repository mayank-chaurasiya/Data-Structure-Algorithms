public class RotatedSortedArray {
    public static int search(int arr[], int target) {
        int n = arr.length;
        int start = 0, end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // left sorted
            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && target <= arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            // Right Sorted
            else {
                if (arr[mid] <= target && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 4, 5, 6, 7, 0, 1, 2 };

        int target = 0;
        System.out.println(search(arr, target));
    }
}
