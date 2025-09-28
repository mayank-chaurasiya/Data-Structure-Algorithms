import java.util.Scanner;

public class P17_ArmstrongInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting number of the range : ");
        int start = scan.nextInt();

        System.out.println("Enter the ending number of the range : ");
        int end = scan.nextInt();

        System.out.println("Armstrong numbers in the range " + start + " to " + end + " are : ");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        scan.close();
    }

    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int numDigits = 0;
        int sum = 0;

        // count the numbers of the digits
        while (num != 0) {
            num /= 10;
            numDigits++;
        }
        num = originalNum;
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == originalNum;
    }
}
