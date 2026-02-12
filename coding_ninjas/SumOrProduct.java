// Problem statement
// You are given a number ‘N’ and a query ‘Q.’ If ‘Q’ is 1, then you have to return the sum of all integers from 1 to ‘N,’ else if ‘Q’ is equal to 2 then you have to return the product of all integers from 1 to ‘N.’ Since the product can be very large, return it modulo 10 ^ 9 + 7.

// For example

// Given ‘N’ = 4, ‘Q’ = 1. 
// Then the answer is 10 because the sum of all integers between 1 and 4 are 1, 2, 3, and 4. Hence 1 + 2 + 3 + 4 is equal to 10.
// Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
// 1 <= ‘T’ <= 10
// 1 <= ‘N’ <= 10^4
// 1 <= ‘Q’ <= 2

import java.util.*;

public class SumOrProduct {
    public static long sumOrProduct(int n, int q) {
        if (q == 1) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            return sum;
        } else if (q == 2) {
            long product = 1;
            int MOD = 1000000007; 
            for (int i = 1; i <= n; i++) {
                product = (product * i) % MOD;
            }
            return product;
        }
        return -1;
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int N = scan.nextInt();
            int Q = scan.nextInt();
            System.out.print(sumOrProduct(N, Q));
        }
    }
}
