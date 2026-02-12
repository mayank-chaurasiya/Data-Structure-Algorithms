public class P14_Get_LargeSmall {

    // function to get Largest 
    public static int lElements(int arr[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Function to get smallest
    public static int sElements(int arr[]) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {2, 35, 6, 98, 34};

        System.out.println("Largest element : " + lElements(arr));
        System.out.println("Smallest element : " + sElements(arr));
    }
}
