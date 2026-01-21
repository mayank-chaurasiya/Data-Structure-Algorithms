public class RatInMaze {
    static int N = 4;

    public static boolean solveMaze(int[][] maze) {
        int[][] sol = new int[N][N];

        if (!mazeSolution(maze, 0, 0, sol)) {
            System.out.println("No Solution exists");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static boolean mazeSolution(int maze[][], int row, int col, int sol[][]) {
        if (row == maze.length - 1 && col == maze.length - 1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            return true;
        }

        // check if safe
        if (isSafe(maze, row, col)) {
            // if the index is safe then mark it as '1'.
            sol[row][col] = 1;

            // move down
            if (mazeSolution(maze, row + 1, col, sol)) {
                return true;
            }

            // move right
            if (mazeSolution(maze, row, col + 1, sol)) {
                return true;
            }

            sol[row][col] = 0; // Back Track and mark the index as '0' if it is not safe.
        }
        return false;
    }

    public static boolean isSafe(int maze[][], int row, int col) {
        return row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1;
    }

    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };

        solveMaze(maze);
    }
}
