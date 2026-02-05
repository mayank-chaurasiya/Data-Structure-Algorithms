package revision.queue;

import java.util.*;

class Job {
    int id, deadline, profit;

    Job(int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencing {
    static int[] parent;

    static int find(int x) {
        if (parent[x] == x) {
            return x;

        }
        return parent[x] = find(parent[x]);
    }

    static void union(int u, int v) {
        parent[v] = u;
    }

    static int[] jobScheduling(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;
        for (Job job : jobs)
            maxDeadline = Math.max(maxDeadline, job.deadline);

        parent = new int[maxDeadline + 1];
        for (int i = 0; i <= maxDeadline; i++)
            parent[i] = i;

        int jobCount = 0;
        int maxProfit = 0;

        for (Job job : jobs) {
            int availableSlot = find(job.deadline);
            if (availableSlot > 0) {
                jobCount++;
                maxProfit += job.profit;
                union(find(availableSlot - 1), availableSlot);
            }
        }

        return new int[] { jobCount, maxProfit };
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job(1, 2, 100),
                new Job(2, 1, 19),
                new Job(3, 2, 27),
                new Job(4, 1, 25),
                new Job(5, 3, 15)
        };

        int[] result = jobScheduling(jobs);
        System.out.println("Jobs done: " + result[0]);
        System.out.println("Max profit: " + result[1]);
    }
}
