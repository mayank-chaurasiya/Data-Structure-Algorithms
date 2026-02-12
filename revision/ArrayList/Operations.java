package revision.arraylist;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(3);

        System.out.println(list);
        System.out.println(list.contains(6));

        list.remove(2);
        list.set(2, 78);
        System.out.println(list);

        System.out.println(list.size());
    }
}
