package revision.recursion;

public class DecreasingNumbers {

    public static int decreasingNums(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return 1;
        }
        return decreasingNums(n - 1);
    }

    public static void main(String[] args) {
        decreasingNums(10);
    }
}
