// validating leap years

import java.util.Scanner;
import java.time.Year; // inbuilt function to check for the leap years. 

public class P3_validating_leap_years {
    public static int Leap_years(int years) {
        if (years % 4 == 0) {
            if (years % 100 == 0) {
                if (years % 400 == 0) {
                    return 1;
                } else {
                    return 0;
                }
            } else {
                return 1;
            }
        } else {
            return 0;
        }
        // if ((years % 400 == 0) || (years % 100 != 0) && (years % 4 == 0)) {
        // return 1;
        // } else {
        // return 0;
        // }
    }

    public static boolean checkYear(int years) {
        // create a year object representing the given year
        Year y = Year.of(years);
        // use the isLeap() method of the Year class to check if the year is a leap
        // year.
        return y.isLeap();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter year : ");
        int years = scan.nextInt();

        if (Leap_years(years) == 1) {
            System.out.println(years + " is a Leap Year.");
        } else {
            System.out.println(years + " is not a Leap Year.");
        }

        // check if the given year is a leap year or not.
        // if (checkYear(years)) {
        // System.out.println("Leap Year");
        // } else {
        // System.out.println("Not a Leap year");
        // }
        scan.close();
    }
}
