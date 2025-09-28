import java.util.Arrays;
import java.util.Collections;

public class P15_SortingUsing_Loop {
    public static void main(String[] args) {
        Integer arr[] = { 90, 23, 5, 109, 12, 22 };
        System.out.println("Array  elements after sorting in Ascending Order : ");
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array  elements after sorting in Descending Order : ");
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = i + 1; j < arr.length; j++) {
        //         int temp = 0;
        //         if (arr[i] > arr[j]) {
        //             temp = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        //     System.out.print(arr[i] + " ");
        // }
    }
}
