package revision.queue;

import java.util.PriorityQueue;

public class ConnectNRopes {
    public static long minCost(long[] arr, int n) {
        if (n <= 1)
            return 0;

        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        for (long rope : arr) {
            minHeap.add(rope);
        }

        long totalCost = 0;

        while (minHeap.size() > 1) {
            long first = minHeap.poll();
            long second = minHeap.poll();
            long sum = first + second;

            totalCost += sum;
            minHeap.add(sum);
        }

        return totalCost;
    }

    public static void main(String[] args) {
        long[] arr = { 4, 3, 2, 6 };

        System.out.println(minCost(arr, 4));
    }
}
