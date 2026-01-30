
import java.util.*;

public class basicMaths {

    public static int reverse(int x) {
        int revNum = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            if (revNum > Integer.MAX_VALUE / 10 || revNum < Integer.MIN_VALUE / 10) {
                return 0;
            }
            revNum = (revNum * 10) + lastDigit;
            x = x / 10;
        }
        return revNum;
    }

    public static boolean isPalindrome(int x) {
        int revNum = 0;
        int dup = x;
        while (x != 0) {
            int lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x = x / 10;
        }
        return dup == revNum;
    }

    public static boolean isArmstrong(int num) {
        int dup = num, sum = 0, k = String.valueOf(num).length();
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + (int) (Math.pow(lastDigit, k));
            num = num / 10;
        }
        return dup == sum;
    }

    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    public static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static List<Integer> primes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) {
            isPrime[0] = false;
        }
        if (n >= 1) {
            isPrime[1] = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primesList = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primesList.add(i);
            }
        }
        return primesList;
    }

    public static void main(String[] args) {
        // int number1 = 36;
        // List<Integer> divisors1 = printDivisors(number1);
        // System.out.println("Divisors of " + number1 + ": " + divisors1);

        // int N = 30;
        // List<Integer> primeNumbers = primes(N);
        // System.out.println(primeNumbers);
    }
}
