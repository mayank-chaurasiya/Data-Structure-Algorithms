package leetcode.problems;

import java.util.HashSet;

public class Q2965_FindMissing_andRepeated {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> seen = new HashSet<>();
        int a = -1, b = -1;

        // Step 1: Scan grid to find repeating number 'a'
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int v = grid[i][j];
                if (seen.contains(v)) {
                    a = v; // found the repeating number;
                } else {
                    seen.add(v); // first time seeing it, mark as seen
                }
            }
        }

        // Step 2: Scan range [1, n*n] to find missing number 'b'
        int n = grid.length;
        for (int v = 1; v <= n * n; v++) {
            if (!seen.contains(v)) {
                b = v;
                break; // optimization: stop early once found
            }
        }

        return new int[] { a, b };
    }

    public static void main(String[] args) {
        int[][] grid = { { 1, 3 }, { 2, 2 } };
        int result[] = findMissingAndRepeatedValues(grid);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}