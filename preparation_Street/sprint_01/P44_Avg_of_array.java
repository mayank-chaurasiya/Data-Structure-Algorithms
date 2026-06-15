package preparation_street.sprint_01;

public class P44_Avg_of_array {
    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1 };
        System.out.println("Avg is : " + getAvg(arr));
    }
}
