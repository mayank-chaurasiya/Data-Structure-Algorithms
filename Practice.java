class Practice {
    public static void isPalindrome() {
        int number = 765;
        int copy = number;
        int rev = 0;

        while (number > 0) {
            int rem = number % 10;
            rev = rev * 10 + rem;
            number /= 10;
        }

        if (copy == rev) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }

    public static void main(String[] args) {
        isPalindrome();
    }
}