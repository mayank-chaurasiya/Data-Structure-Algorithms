import java.util.Arrays;

public class CheckForDistinctArray {

    public static boolean distinctArr(int arr[]) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            // for (int j = i + 1; j < arr.length; j++) {

            if (arr[i] == arr[i + 1]) {
                return true;
            }
            // }
        }

        return false;
    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, 3, -1, 4 };

        System.out.println(distinctArr(arr));
    }
}
