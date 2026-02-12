package revision.arraylist;

import java.util.ArrayList;

public class ReverseArrList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println(list.reversed());

        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = list.size(); i > 0; i--) {
            temp.add(i);
        }

        System.out.println(temp);


    }

}