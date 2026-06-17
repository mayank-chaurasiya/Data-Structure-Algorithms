package preparation_street.sprint_02;

public class P01_Sum_Of_Series {
    public static double calculateSum(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.printf("%.6f\n", calculateSum(n));
    }
}