package revision.recursion;

public class PrintXpowerN {
    public static int pow(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * pow(x, n - 1);
    }

    // Optimized
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int p = power(x, n / 2);
        int halfPowerSqre = p * p;

        if (n % 2 != 0) {
            halfPowerSqre = x * halfPowerSqre;
        }

        return halfPowerSqre;
    }

    public static void main(String[] args) {
        // System.out.println(pow(2, 10));
        System.out.println(power(2, 10));
    }
}
