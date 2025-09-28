import java.util.Scanner;

public class P23_FibonacciAtPosition {
    public static int fibonacci(int position) {
        if (position <= 1) {
            return position;
        }
        return fibonacci(position - 1) + fibonacci(position - 2);
    }

    public static void main(String[] args) {
        System.out.println("Enter the position : ");
        Scanner scan = new Scanner(System.in);
        int position = scan.nextInt();

        int result = fibonacci(position);
        System.out.println("fibonacci at position " + position + " is : " + result);
        scan.close();
    }
}
