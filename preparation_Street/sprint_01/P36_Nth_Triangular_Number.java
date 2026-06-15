package preparation_street.sprint_01;

import java.util.Scanner;

public class P36_Nth_Triangular_Number {
    public static int getTriangularNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = scan.nextInt();
        System.out.print("The " + n + "th Triangular Number is : " + getTriangularNumber(n));
        scan.close();
    }
}
