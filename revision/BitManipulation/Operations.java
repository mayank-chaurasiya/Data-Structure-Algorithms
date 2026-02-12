public class Operations {
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;

        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;

        return n | bitMask;
    }

    public static int clearLastBit(int n, int i) {
        int bitMask = (~0) << i;

        return n & bitMask;
    }

    public static int clearRangeOfBit(int n, int i, int j) {
        int a = ((~0) << j + 1);
        int b = (1 << i) - 1;

        int bitMask = a | b;

        return n & bitMask;
    }

    public static boolean powerOf2OrNot(int n) {
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearLastBit(15, 2));
        // System.out.println(clearRangeOfBit(10, 2, 4));
        System.out.println(powerOf2OrNot(6));
    }
}
