public class Majority_Element_naive_Approach {

    // Function to find the majority element in an array
    public static int majorityElement(int[] arr) {
        // Loop to consider each element as a candidate for majority
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // Inner loop to count the frequency of arr[i]
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // Check if count of arr[i] is more than half the size of the array
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        // If no majority element found. return -1.
        return -1;
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 2, 1, 3, 5, 1, 1 };
        int arr2[] = { 3, 3, 4, 2, 4, 4, 2, 4 };

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