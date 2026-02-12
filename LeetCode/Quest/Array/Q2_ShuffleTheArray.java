package leetcode.quest.array;
public class Q2_ShuffleTheArray {

    public static int[] suffle(int[] arr, int n) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = arr[i];
            ans[2 * i + 1] = arr[i + n];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};

        int n = arr.length / 2;

        int result[] = suffle(arr, n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
