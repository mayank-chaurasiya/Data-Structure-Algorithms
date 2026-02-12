import java.util.HashMap;
import java.util.Map;

public class Majority_Element_Optimal_Approach {
    public static int majorityElement(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> countMap = new HashMap<>();
        // traverse the array and count occurences using the hash map
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            // check if the current element count exceeds n / 2
            if (countMap.get(num) > n / 2) {
                return num;
            }
        }
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
