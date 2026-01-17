package revision.DivideAndConquer;

public class SortArrOfStrings {
    public static void printArr(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortStringArr(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        sortStringArr(arr, si, mid);
        sortStringArr(arr, mid + 1, ei);

        mergeArr(arr, si, mid, ei);
    }

    public static void mergeArr(String[] arr, int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si, j = mid + 1, k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };
        sortStringArr(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
