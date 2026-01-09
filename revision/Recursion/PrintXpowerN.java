package revision.Recursion;

public class PrintXpowerN {
    public static int powNtoX(int x, int n) {
        if(n == 1) {
            return x;
        }

        return x * powNtoX(x, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(powNtoX(2, 10));
    }
}
