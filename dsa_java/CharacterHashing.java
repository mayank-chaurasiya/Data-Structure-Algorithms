
import java.util.*;

public class CharacterHashing {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            String s = sc.next();

            // converts the uppercase one to lower case and store them in new string.. and
            // perform precompute on the new String.
            String newS = s.toLowerCase();

            // precompute
            int[] hash = new int[26];
            // int[] hash = new int[256];
            for (int i = 0; i < newS.length(); i++) {
                hash[newS.charAt(i) - 'a']++;
                // hash[s.charAt(i)]++;
            }

            int q = sc.nextInt();
            while (q-- != 0) {
                char c;
                c = sc.next().charAt(0);
                System.out.println(hash[c - 'a']);
            }
        }
    }
}
