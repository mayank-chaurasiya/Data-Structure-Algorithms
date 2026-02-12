public class TransposeMatrix {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void transpose(int[][] matrix) {

        System.out.println("----------- Before transpose -------------");
        printMatrix(matrix);

        // ----------- transpose -------------

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] transpose = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("----------- After transpose -------------");
        printMatrix(transpose);
    }

    public static void main(String[] args) {
        int[][] matrix = { { 4, 7, 8 },
                { 11, 4, 3 },
                { 2, 2, 3 } };

        transpose(matrix);
    }
}
