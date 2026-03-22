package foundation.Day_03;

import java.util.Scanner; // bring Scanner into your program

public class Day3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create Scanner

        System.out.print("What is your name? ");
        String name = scanner.nextLine(); // reads a full line of text

        System.out.print("How old are you? ");
        int age = scanner.nextInt(); // reads a whole number
        scanner.nextLine(); // The discarded nextLine() just swallows the leftover Enter and throws it away.
                            // Now the real nextLine() waits for actual user input.

        System.out.print("Which city are you from? ");
        String city = scanner.nextLine(); // will this work?

        System.out.println("Hello " + name + " from " + city + "!");

        System.out.println("Hello " + name + "! You are " + age + " years old.");

        scanner.close(); // always close when done
    }
}
