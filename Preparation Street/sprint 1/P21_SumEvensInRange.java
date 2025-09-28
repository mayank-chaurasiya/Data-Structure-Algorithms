import java.util.Scanner;

public class P21_SumEvensInRange {
    public static void sumEvens(int start, int end) {
        int sum = 0;

        System.out.println("Even numbers from " + start + " to " + end + " are : ");

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Sum of all the even numbers starting from " + start + " to " + end + " is : " + sum);
    }
    
    public static void sumOdds(int start, int end) {
        int sum = 0;
        
        System.out.println("Odd numbers from " + start + " to " + end + " are : ");
        
        for(int i = start; i <= end; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("Sum of all the Odd numbers starting from " + start + " to " + end + " is : " + sum);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting : ");
        int start = scan.nextInt();
        System.out.println("Enter the ending : ");
        int end = scan.nextInt();

        sumEvens(start, end);
        sumOdds(start, end);
        scan.close();
    }
}
