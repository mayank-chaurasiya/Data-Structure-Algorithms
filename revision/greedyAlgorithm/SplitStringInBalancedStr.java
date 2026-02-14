package revision.greedyAlgorithm;

// 1221 - leetcode Split a string in a balanced Strings
public class SplitStringInBalancedStr {
    public static int balancedStringSplit(String s) {
        int balance = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                balance++;
            } else {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        System.out.print("max splid string in Balanced String is : " + balancedStringSplit(s));
    }
}
