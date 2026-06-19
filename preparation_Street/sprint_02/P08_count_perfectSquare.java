package preparation_street.sprint_02;

import preparation_street.sprint_01.P20_CheckForPerfectNumbers;

import java.util.Scanner;

public class P08_count_perfectSquare {
    public static int countPerfectNumber(int limit) {
        int count = 0;
        for (int i = 1; i <= limit; i++) {
            if (P20_CheckForPerfectNumbers.checkPerfectNumber(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your limit: ");
        int limit = scan.nextInt();
        System.out.println("count is : " + countPerfectNumber(limit));
        scan.close();
    }
}
