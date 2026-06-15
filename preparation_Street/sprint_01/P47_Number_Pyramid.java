package preparation_street.sprint_01;

public class P47_Number_Pyramid {
    public static void numberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        numberPyramid(5);
    }
}
