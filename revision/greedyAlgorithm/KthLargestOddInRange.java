package revision.greedyAlgorithm;

public class KthLargestOddInRange {
    public static long kthOdd(long[] range, long K) {
        long L = range[0];
        long R = range[1];

        long largestOdd = (R % 2 == 1) ? R : R - 1;
        long candidate = largestOdd - 2 * (K - 1);

        if (candidate < L) {
            return 0;
        }

        return candidate;
    }

    public static void main(String[] args) {
        long range[] = { -3, 3 };
        System.out.print("Kth Largest Odd is : " + kthOdd(range, 1));
    }
}
