package revision.arraylist;

import java.util.ArrayList;

public class PairSum1 {

    // Brute force
    public static void getTargetSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    System.out.print("[" + list.get(i) + "," + list.get(j) + "] ");
                    // return;
                }
            }
        }
    }

    // 2 pointer appraoch
    public static void targetSum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size() - 1;

        while (lp < rp) {

            if (list.get(lp) + list.get(rp) == target) {
                System.out.print("[" + list.get(lp) + "," + list.get(rp) + "] ");
                lp++;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        getTargetSum(list, 5);
        targetSum(list, 5);
    }
}
