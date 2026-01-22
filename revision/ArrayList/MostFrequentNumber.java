package revision.ArrayList;

import java.util.ArrayList;

public class MostFrequentNumber {

    public static int mostFrequent(ArrayList<Integer> arr, int key) {
        int[] result = new int[1000];

        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) == key) {
                result[arr.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;

        for (int i = 0; i < 1000; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(100);
        arr.add(200);
        arr.add(1);
        arr.add(100);

        System.out.print(mostFrequent(arr, 1));
    }
}
