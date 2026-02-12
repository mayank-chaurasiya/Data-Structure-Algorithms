package revision.backtracking;
// number of ways to reach from (0, 0) to (n - 1, m - 1) in a N * M Grid. ALLOWED moves - right or down

public class GridWays {
    public static int nWays(int grid[][], int row, int col) {
        if (row == grid.length - 1 || col == grid[0].length - 1) {
            return 1;
        } else if (row == grid.length || col == grid[0].length) {
            return 0;
        }
        return nWays(grid, row, col + 1) + nWays(grid, row + 1, col);
    }

    public static void main(String[] args) {
        int[][] grid = new int[3][3];

        System.out.print(nWays(grid, 0, 0));
    }
}
