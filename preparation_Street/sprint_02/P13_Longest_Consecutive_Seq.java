package preparation_street.sprint_02;

import java.util.Arrays;

public class P13_Longest_Consecutive_Seq {
    public static int longestSeq(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);
        int longest = 1;
        int current = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                current++;
            } else {
                longest = Math.max(longest, current);
                current = 1;
            }
        }
        return Math.max(longest, current);
    }

    public static void main(String[] args) {
        int arr[] = { 100, 4, 200, 1, 3, 2 };
        System.out.println(longestSeq(arr));
    }
}
