public class SpiralMatrix {

    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            for (int j = endCol - 1; j >= startRow; j--) {
                System.out.print(matrix[endRow][j] + " ");
            }

            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        spiralMatrix(matrix);
    }
}
