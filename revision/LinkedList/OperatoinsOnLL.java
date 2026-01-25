package revision.LinkedList;

import java.util.LinkedList;

public class OperatoinsOnLL {
    public static void main(String[] args) {
        // Create
        LinkedList<Integer> ll = new LinkedList<>();
        // Add
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);

        System.out.println(ll);
        // Remove

        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);
    }
}
