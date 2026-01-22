//Leetcode - 11

package LeetCode.Problems;

public class Q11_ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxWater = 0, lp = 0, rp = height.length - 1;

        while (lp < rp) {
            int ht = Math.min(height[lp], height[rp]),
                    width = rp - lp, currWater = ht * width;

            maxWater = Math.max(maxWater, currWater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

    System.out.print(maxArea(height));
    }
}
