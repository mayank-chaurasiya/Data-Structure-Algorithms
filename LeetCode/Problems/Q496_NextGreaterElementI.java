package leetcode.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Q496_NextGreaterElementI {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        int[] result = new int[nums1.length];

        for (int num : nums2) {
            while (!s.isEmpty() && s.peek() < num) {
                nextGreater.put(s.pop(), num);
            }
            s.push(num);
        }

        while (!s.isEmpty()) {
            nextGreater.put(s.pop(), -1);
        }

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        int result[] = nextGreaterElement(nums1, nums2);

        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
