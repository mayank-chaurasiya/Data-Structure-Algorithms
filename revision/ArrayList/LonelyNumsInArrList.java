package revision.arraylist;

import java.util.*;

public class LonelyNumsInArrList {
    public static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);

        List<Integer> lonelyNumbers = new ArrayList<>();

        // HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        // for (int i = 0; i < nums.length; i++) {
        // if (hm.containsKey(nums[i])) {
        // hm.put(nums[i], hm.get(nums[i]) + 1);
        // } else {
        // hm.put(nums[i], 1);
        // }
        // }
        // for (int i = 0; i < nums.length; i++) {
        // if (hm.get(nums[i]) == 1 && !hm.containsKey(nums[i] + 1) &&
        // !hm.containsKey(nums[i] - 1)) {
        // lonelyNumbers.add(nums[i]);
        // }
        // }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums.length == 1 || nums[i + 1] - nums[i] > 1) {
                    lonelyNumbers.add(nums[i]);
                }
            } else if (i == nums.length - 1) {
                if (nums[i] - nums[i - 1] > 1) {
                    lonelyNumbers.add(nums[i]);
                }
            } else {
                if ((nums[i + 1] - nums[i] > 1) && (nums[i] - nums[i - 1] > 1)) {
                    lonelyNumbers.add(nums[i]);
                }
            }
        }
        return lonelyNumbers;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 3 };

        List<Integer> lonelyNumbers = findLonely(nums);
        System.out.println(lonelyNumbers);
    }
}
