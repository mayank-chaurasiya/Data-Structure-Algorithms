import java.util.Arrays;

public class Majority_Element_better_Approach {

    // function to find the Majority element in an array using sorting which returns
    // -1 if there is no majority element.
    public static int majorityElement(int[] arr) {
        // If the array has only one element, return that element as it is the majority
        // by default.
        if (arr.length == 1) {
            return arr[0];
        }
        int count = 1;
        Arrays.sort(arr);

        // Loop through the element starting from 1.
        for (int i = 1; i < arr.length; i++) {
            // If the current element arr[i] is same as the previous one arr[i - 1]
            // increment the count.
            if (arr[i - 1] == arr[i]) {
                count++;
                // if the current element is different from the previous one
            } else {
                // check if the count is greater than arr.length / 2. if true return the
                // previous element arr[i - 1] as the majority element.
                if (count > arr.length / 2) {
                    return arr[i - 1];
                }
                // reset count to 1 for the new element.
                count = 1;
            }
        }

        // After the loop, check if the last counted element is the majority element. If
        // true, return it.
        if (count > arr.length / 2) {
            return arr[arr.length - 1];
        }

        // if no majority element, return -1
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 2, 1, 3, 5, 1, 1 };
        int arr2[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4 };

        // store the returned value of majorityElement function
        int found = majorityElement(arr2);

        // compare the found with -1 and print the specific message on output window.
        if (found == -1) {
            System.out.println("No majority Elements found");
        } else {
            System.out.println("majority element is : " + found);
        }
    }
}
