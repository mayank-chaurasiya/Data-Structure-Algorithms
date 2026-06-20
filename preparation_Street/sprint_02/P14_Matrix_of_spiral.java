package preparation_street.sprint_02;

import java.util.Scanner;

public class P14_Matrix_of_spiral {
    public static void printSpiralMatrix(int size) {
        int[][] matrix = new int[size][size];
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        int num = 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++;
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }

            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                matrix[endRow][j] = num++;
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                matrix[i][startCol] = num++;
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = scan.nextInt();
        printSpiralMatrix(size);
        scan.close();
    }
}
