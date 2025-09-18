// check for the prime numbers 

import java.util.Scanner;

public class P2_checkForPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int number = sc.nextInt();
        int isPrime = 1;
        if(number <= 1) {
            isPrime = 0;
        } else {
            for(int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    isPrime = 0;
                    break;
                }
            }
        }

        if( isPrime == 1) {
            System.out.println(number + " is Prime number.");
        } else {
            System.out.println(number + " is not a Prime number.");
        }
        sc.close();
    }
}