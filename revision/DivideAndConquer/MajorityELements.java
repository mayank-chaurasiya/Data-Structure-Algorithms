package revision.DivideAndConquer;

public class MajorityELements {
    public static int majorityElement(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > arr.length / 2) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int countInRange(int[] arr, int num, int si, int ei) {
        int count = 0;
        for (int i = si; i <= ei; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    public static int majorityElementRec(int[] arr, int si, int ei) {
        if (si == ei) {
            return arr[si];
        }

        int mid = (ei - si) / 2 + si;
        int left = majorityElementRec(arr, si, mid);
        int right = majorityElementRec(arr, mid + 1, ei);

        if (left == right) {
            return left;
        }

        int leftCount = countInRange(arr, left, si, ei);
        int rightCount = countInRange(arr, right, si, ei);

        return leftCount > rightCount ? left : right;
    }

    public static int majorElement(int[] arr){
        return majorityElementRec(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.print(majorElement(arr));
    }
}
