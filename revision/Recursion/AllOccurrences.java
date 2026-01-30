package revision.recursion;

public class AllOccurrences {
    public static void printAllOccurrence(int arr[], int key, int i, String str) {
        if (i == arr.length) {
            System.out.print(str);
            return;
        }

        if (arr[i] == key) {
            printAllOccurrence(arr, key, i + 1, str + i + " ");
        } else {
            printAllOccurrence(arr, key, i + 1, str);

        }
    }

    public static void allOccurrence(int arr[], int i, int key) {
        if (i == arr.length) {
            return;
        }

        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        allOccurrence(arr, i + 1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 6, 2, 2, 7, 2, 2 };

        // printAllOccurrence(arr, 2, 0, "");
        allOccurrence(arr, 0, 2);
    }
}
