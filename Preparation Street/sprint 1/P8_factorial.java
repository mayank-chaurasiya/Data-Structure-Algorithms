public class P8_factorial {
    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
