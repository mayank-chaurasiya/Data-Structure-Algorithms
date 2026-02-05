package revision.queue;

import java.util.*;

public class ReversingKElements {
    public static void reverseFirstK(Queue<Integer> q, int k) {
        Stack<Integer> s = new Stack<>();

        if (q.isEmpty() || k > q.size() || k <= 0) {
            return;
        }

        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int remaining = q.size() - k;

        for(int i = 0; i < remaining; i++){
            q.add(q.remove());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 100));
        reverseFirstK(q, 5);

        System.out.println(q);
    }
}
