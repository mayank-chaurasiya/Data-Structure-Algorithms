package revision.stackoperations;

import java.util.Stack;

public class TrappingRainWater {
    public static int trap(int[] height) {
        Stack<Integer> stack = new Stack<>();
        int totalWater = 0;
        for (int i = 0; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int bottom = stack.pop();

                if (stack.isEmpty()) {
                    break;
                }

                int left = stack.peek();
                int width = i - left - 1;

                int boundedHeight = Math.min(height[left], height[i]) - height[bottom];
                totalWater += width * boundedHeight;
            }
            stack.push(i);
        }
        return totalWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trap(height));
    }
}
