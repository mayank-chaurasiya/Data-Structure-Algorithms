package revision.recursion;

public class LastOccurence {
    public static int lastOcc(int[] arr, int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, i + 1, key);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 3, 2, 2, 5, 6, 8 };

        System.out.println(lastOcc(arr, 0, 2));

    }
}
