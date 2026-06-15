package preparation_street.sprint_01;

public class P48_sum_of_PrimeFactors {
    public static int sumOfPrimeFactors(int n) {
        int sum = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        if (n > 1) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.print(sumOfPrimeFactors(12));
    }
}
