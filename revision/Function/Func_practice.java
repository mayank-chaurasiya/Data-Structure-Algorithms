import java.util.*;

public class Func_practice {

    public static int factorial(int num) {
        int factorial = 1;
        if (num < 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


        //-------------------------------------------------------------------
        // factorial function
        // int n = sc.nextInt();
        // System.out.println("Factorial of " + n + " = " + factorial(n));
        sc.close();
    }
}