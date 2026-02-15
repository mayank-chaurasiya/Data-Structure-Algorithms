package revision.greedyAlgorithm;

// 1663. Smallest String With A Given Numeric Value
public class LexicographicallySmallestString {

    public static String getSmallestString(int N, int K) {
        // Feasibility check
        if (K < N || K > 26 * N) {
            return "";
        }

        char[] result = new char[N];

        // Step 1: Fill with 'a'
        for (int i = 0; i < N; i++) {
            result[i] = 'a';
        }

        int extra = K - N;

        // Step 2: Distribute from right to left
        for (int i = N - 1; i >= 0 && extra > 0; i--) {
            int increase = Math.min(25, extra);
            result[i] = (char) (result[i] + increase);
            extra -= increase;
        }

        return new String(result);
    }

    public static void main(String[] args) {
        System.out.println(getSmallestString(5, 73));
    }
}
