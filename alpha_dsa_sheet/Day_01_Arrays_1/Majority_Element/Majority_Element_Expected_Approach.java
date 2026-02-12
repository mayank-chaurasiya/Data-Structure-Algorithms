// expected appraoch
public class Majority_Element_Expected_Approach {
    public static int majorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Validate the candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // if count is greater than n / 2, return the candidate: otherwise, return -1
        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 1, 2, 1, 3, 5, 1, 1 };
        int arr2[] = { 3, 3, 4, 2, 4, 4, 2, 4, 4};

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
