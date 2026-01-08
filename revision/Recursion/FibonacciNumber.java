package revision.Recursion;

public class FibonacciNumber {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        
        if (n == 1) {
            return 1;
        }

        int first = fibonacci(n - 1);
        int second = fibonacci(n - 2);
        return first + second;
    }

    public static void main(String[] args) {
        System.out.print(fibonacci(5));
    }
}
