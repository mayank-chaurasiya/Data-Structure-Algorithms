package revision.ArrayList;

import java.util.ArrayList;

public class BeautifulArrList {
    // iterative approach
    public static ArrayList<Integer> beautifulArr(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (Integer e : ans) {
                if (2 * e <= n) {
                    temp.add(e * 2);
                }
            }
            for (Integer e : ans) {
                if (2 * e - 1 <= n) {
                    temp.add(e * 2 - 1);
                }
            }

            ans = temp;
        }
        return ans;
    }

    // divide and conquer
    public static ArrayList<Integer> beautiful(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        divideConquer(1, 1, result, n);
        return result;
    }

    private static void divideConquer(int start, int increment, ArrayList<Integer> result, int n) {
        if (start + increment > n) {
            result.add(start);
            return;
        }
        divideConquer(start, 2 * increment, result, n);
        divideConquer(start + increment, 2 * increment, result, n);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = beautiful(5);

        System.out.println(arr);
    }
}
