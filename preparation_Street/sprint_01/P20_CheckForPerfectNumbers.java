import java.util.Scanner;

public class P20_CheckForPerfectNumbers {
    public static void main(String[] args) {
        long n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number : ");
        n = scan.nextLong();
        int i = 1;

        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if(sum == n) {
            System.out.println(n + " is a perfect square");
        } else {
            System.out.println(n + " is not a perfect square.");
        }
        scan.close();
    }
}
