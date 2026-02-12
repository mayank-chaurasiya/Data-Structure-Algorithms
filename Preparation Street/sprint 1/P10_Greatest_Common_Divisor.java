public class P10_Greatest_Common_Divisor {

    public static void main(String[] args) {
        // using for loop
        int n1 = 81, n2 = 153, gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        
        // using while loop
        while(n1 != n2) {
            if(n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}