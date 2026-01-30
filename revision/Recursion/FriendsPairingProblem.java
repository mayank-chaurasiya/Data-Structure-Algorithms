package revision.recursion;

public class FriendsPairingProblem {
    public static int countPairings(int n) {
        return n <= 2 ? n : countPairings(n - 1) + (n - 1) * countPairings(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(countPairings(4));
    }
}
