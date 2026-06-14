package preparation_street.sprint_01;

import java.util.Scanner;

public class P31_Pascals_Triangle {
    public static void printPascalsTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows : ");
        int rows = scan.nextInt();
        printPascalsTriangle(rows);
        scan.close();
    }
}
