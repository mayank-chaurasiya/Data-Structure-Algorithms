package preparation_street.sprint_02;

public class P05_Matrix_0f_Multipliction {
    public static void printMatrix(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printMatrix(10);
    }
}
