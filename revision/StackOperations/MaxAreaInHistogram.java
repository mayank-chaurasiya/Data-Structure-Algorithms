package revision.stackoperations;

//Leetcode 84. Largest Rectangle in Histogram
import java.util.Stack;

public class MaxAreaInHistogram {
    public static void maxArea(int heights[]) {
        int maxArea = 0;
        int nsl[] = new int[heights.length]; // next smaller left
        int nsr[] = new int[heights.length]; // next smaller right

        Stack<Integer> sr = new Stack<>();

        // Next smaller left
        for (int i = 0; i < heights.length; i++) {
            while (!sr.isEmpty() && heights[sr.peek()] >= heights[i]) {
                sr.pop();
            }
            if (sr.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = sr.peek();
            }
            sr.push(i);
        }

        // Next smaller right
        sr = new Stack<>();
        for (int i = heights.length - 1; i >= 0; i--) {
            while (!sr.isEmpty() && heights[sr.peek()] >= heights[i]) {
                sr.pop();
            }
            if (sr.isEmpty()) {
                nsr[i] = heights.length;
            } else {
                nsr[i] = sr.peek();
            }
            sr.push(i);
        }

        // current area : width = j - i - 1 = nsr[i] - nsl[i] - 1
        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;

            maxArea = Math.max(maxArea, currArea);
        }

        System.out.println("Max area in histogram is : " + maxArea);

    }

    public static void main(String[] args) {
        int[] heights = { 2, 1, 5, 6, 2, 3 };

        maxArea(heights);
    }
}
