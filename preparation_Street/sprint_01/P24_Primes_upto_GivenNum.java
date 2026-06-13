
// Write a program to print all prime numbers less than a given number.
import java.util.*;

public class P24_Primes_upto_GivenNum {
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void printPrime(int n) {
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        printPrime(11);
    }
}