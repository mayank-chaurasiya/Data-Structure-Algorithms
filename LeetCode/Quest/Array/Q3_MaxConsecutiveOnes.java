package leetcode.quest.array;
public class Q3_MaxConsecutiveOnes {

    public static int consecutiveOnes(int arr[], int target) {
        int maxStreak = 0;
        int currStreak = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                currStreak = currStreak + 1;
            } else {
                maxStreak = Math.max(maxStreak, currStreak);
                currStreak = 0;
            }
        }
        return Math.max(maxStreak, currStreak);
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1};

        System.out.print(consecutiveOnes(arr, 1));
    }
}
