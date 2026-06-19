package preparation_street.sprint_02;

import java.util.Scanner;

public class P07_Get_Sum_FirstN_Odds {
    public static int getSumOfOdds(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = scan.nextInt();
        System.out.print(getSumOfOdds(n));
        scan.close();
    }
}
