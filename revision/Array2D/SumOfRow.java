public class SumOfRow {
    public static int sumOfRow(int[][] matrix) {
        int sum = 0, col = 0, row = 1;
        while (col < matrix[0].length) {
            sum += matrix[row][col];
            col++;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 4, 7, 8 }, { 11, 4, 3 }, { 2, 2, 3 } };

        System.out.println(sumOfRow(matrix));
    }
}
