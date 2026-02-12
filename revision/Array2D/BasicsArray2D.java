import java.util.*;

public class BasicsArray2D {

    public static void search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println(key + " Exist at row : " + i + " column : " + j);
                }
            }
        }
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("---------- Enter the elements of the matrix ---------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("---------- the matrix is ---------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("---------- Enter the key to find :  ");
        int key = sc.nextInt();

        search(matrix, key);

        sc.close();
    }
}
