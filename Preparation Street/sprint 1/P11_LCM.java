public class P11_LCM {
    public static void main(String[] args) {
        int a = 15, b = 25, lcm;
        lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                System.out.println("LCM of " + a + " and " + b + " is " + lcm);
                break;
            }
            ++lcm;
        }
    }
}
