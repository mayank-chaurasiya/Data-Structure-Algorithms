package foundation.Day_03;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Exercise 01 */

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("How old are you? ");
        int age = scanner.nextInt();

        System.out.print("What is your Height? ");
        double height = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("Hi %s! you are %dyrs old and your height is %.2f %n", name, age, height);

        /* Exercise 02 */

        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();

        /* use of arithmatic operators */
        System.out.printf("Add of %d and %d is %d. %n", num1, num2, num1 + num2);
        System.out.printf("Difference of %d and %d is %d. %n", num1, num2, num1 - num2);
        System.out.printf("Product of %d and %d is %d. %n", num1, num2, num1 * num2);
        System.out.printf("Quotient of %d and %d is %d. %n", num1, num2, num1 / num2);
        System.out.printf("Remainder of %d and %d is %d. %n", num1, num2, num1 % num2);

        /* Exercise 03 */

        System.out.print("Enter your number : ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num % 2 == 0) {
            System.out.printf("%d is even. %n", num);
        } else {
            System.out.printf("%d is odd. %n", num);
        }

        /*
         * Exercise 04
         * 1st line will print 8 hello 24
         * 2nd line will print result: 8
         */

        System.out.println(5 + 3 + " hello " + 2 + 4);
        System.out.println("result: " + (5 + 3));

        /* Exercise 05 -- Bill Calculator */
        System.out.print("Item name: ");
        String itemName = scanner.nextLine();

        System.out.print("Item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Item quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("Total bill for %s X %d = %.2f, costing %.2f each %s. %n", itemName, quantity,
                quantity * price,
                price, itemName);

        scanner.close();
    }
}
