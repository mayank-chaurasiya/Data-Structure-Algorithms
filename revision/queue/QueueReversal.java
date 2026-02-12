package revision.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        int size = q.size();

        for (int i = 0; i < size; i++) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        reverseQueue(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
