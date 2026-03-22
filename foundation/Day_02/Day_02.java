package foundation.Day_02;

public class Day_02 {
    public static void main(String[] args) {
        /* Exercise 1 */
        String name = "Mayank";
        int age = 20;
        double height = 5.9;
        long number = 7777777777L;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Phone: " + number);

        /* Exercise 2 -- Widening */
        int value = 100;
        double v2 = value;
        System.out.println(value + " " + v2);

        /* Exercise 3 -- Narrowing */
        double price = 99.99;
        int discountedPrice = (int) price;
        System.out.println(price + " " + discountedPrice);

        /*
         * Exercise 4 -- My predictions
         * first line prints -- 7
         * second line prints -- 5.0
         * third line prints -- 3
         * fourth line prints -- 3.333333333333333
         */
        System.out.println((int) 7.9);
        System.out.println((double) 5);
        System.out.println(10 / 3);
        System.out.println(10.0 / 3);

        /*
         * Exercise 5 --
         * int age = 20.9 (there is a type mismatch)
         * long population is missing L after the numberss .. java will detect it as
         * int.
         */

    }
}