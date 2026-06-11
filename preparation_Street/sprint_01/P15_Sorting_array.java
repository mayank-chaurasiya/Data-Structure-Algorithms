public class P15_Sorting_array {

    // 1. using user defined funcion :
    private static void sortArray(int array[], int n) {
        for (int i = 1; i < n; i++) {
            int j = i, a = array[i];
            while ((j > 0) && (array[j - 1] > a)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = a;
        }
    }

    public static void main(String[] args) {
        int i;
        int array[] = { 12, 45, -1, 0, 4, 56, 23 };
        System.out.println("Before sorting : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        sortArray(array, array.length);
        System.out.println("After sorting : ");
        for (i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
