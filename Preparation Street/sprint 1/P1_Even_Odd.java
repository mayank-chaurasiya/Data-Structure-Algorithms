//Determine Even/Odd Numbers

import java.util.Scanner;

public class P1_Even_Odd {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        char choice;
        do {

            System.out.print("Enter a number : ");
            int number = in.nextInt();
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd");
            }
            System.out.println("Do you want to continue? (y/n)");
            choice = in.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        in.close();
    }
}