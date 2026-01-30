package revision.arraylist;

import java.util.ArrayList;

public class MultiDimensionArrList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(4);
        list1.add(3);
        list1.add(5);

        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(5);
        list2.add(9);
        list2.add(3);
        list2.add(6);

        mainList.add(list2);

        System.out.println(mainList);
        System.out.println("size of main list is : " + mainList.size());
        System.out.println("size of list1 is : " + list1.size());
        System.out.println("size of list2 is : " + list2.size());

        System.out.println();

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
        }
    }
}
