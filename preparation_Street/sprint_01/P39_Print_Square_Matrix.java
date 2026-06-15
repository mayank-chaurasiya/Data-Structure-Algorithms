package preparation_street.sprint_01;

import java.util.Scanner;

public class P39_Print_Square_Matrix {
    public static void printSquareMatrix(int lines) {
        int[][] matrix = new int[lines][lines];

        int seq = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = seq;
                seq++;
            }
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
        System.out.print("Enter No. of lines : ");
        int lines = scan.nextInt();
        printSquareMatrix(lines);
        scan.close();
    }
}
