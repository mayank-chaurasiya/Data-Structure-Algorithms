package preparation_street.sprint_02;

import java.util.Scanner;

public class P12_sum_of_numbers_in_string {
    public static int getSum(String str) {
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num = 0;

                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string : ");
        String str = scan.nextLine();
        System.out.println(getSum(str));
        scan.close();
    }
}
