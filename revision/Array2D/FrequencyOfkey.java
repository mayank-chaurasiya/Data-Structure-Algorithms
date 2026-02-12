public class FrequencyOfkey {
    public static int search(int[][] matrix, int key) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 4, 7, 8 }, { 8, 8, 7 } };

        int key = 7;
        System.out.println(search(matrix, key));

    }
}
