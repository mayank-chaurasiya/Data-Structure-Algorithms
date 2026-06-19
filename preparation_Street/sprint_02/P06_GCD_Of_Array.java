package preparation_street.sprint_02;

public class P06_GCD_Of_Array {
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findGCD(int[] arr) {
        int result = arr[0];

        for (int i = 1; i < arr.length; i++) {
            result = gcd(result, arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 24, 36 };
        System.out.println(findGCD(arr));
    }
}
