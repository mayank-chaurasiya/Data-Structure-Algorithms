package preparation_street.sprint_01;

public class P45_Find_Mode {
    public static int findMode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4 };
        System.out.println("Mode is : " + findMode(arr));
    }
}
