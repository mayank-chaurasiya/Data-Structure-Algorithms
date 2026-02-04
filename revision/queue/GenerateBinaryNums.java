package revision.queue;

import java.util.*;

public class GenerateBinaryNums {
    public static List<String> getBinaryNums(int num) {
        List<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");
        for (int i = 1; i <= num; i++) {
            String curr = q.poll();
            result.add(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 2;
        
        System.out.print(getBinaryNums(num));
    }
}
