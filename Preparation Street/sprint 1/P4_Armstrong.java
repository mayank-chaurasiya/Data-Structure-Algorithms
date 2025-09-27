public class P4_Armstrong {

    // function to calculate x raised to the power y
    int power(int x, long y) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 0) {
            return power(x, y / 2) * power(x, y / 2);
        }

        return x * power(x, y / 2) * power(x, y / 2);
    }

    // function to calculate order of the number
    int order(int x) {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }

    // function to check whether the given number is Armstrong number or not.
    boolean isArmstrong(int x) {
        // calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }

        // if satisfies Armstrong condition
        return (sum == x);
    }

    public static void main(String[] args) {
        P4_Armstrong ob = new P4_Armstrong();
        int x = 153;
        System.out.println(ob.isArmstrong(x));
        x = 1253;
        System.out.println(ob.isArmstrong(x));
    }
}
