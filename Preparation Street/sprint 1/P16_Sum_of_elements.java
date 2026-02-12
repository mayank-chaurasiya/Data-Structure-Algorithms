public class P16_Sum_of_elements {
    public static void main(String[] args) {
        int arr[] = { 12, 90, 34, 2 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the elements of array is : " + sum);
    }
}
