package revision.LinkedList;

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // forward link
        head.prev = newNode; // backward link
        head = newNode; // update tail
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // forward link
        newNode.prev = tail; // backward link
        tail = newNode; // update tail
    }

    public void addInMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node newNode = new Node(data);
        Node temp = head;

        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        size++;
    }

    // remove
    public int removeFirst() {
        if (head == null) {
            System.out.println("Doubly linked list is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("doubly linked list is empty");
            return Integer.MIN_VALUE;
        }

        int val = tail.data;

        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        size--;
        return val;
    }

    public void removeNthNode(int n) {
        if (head == null) {
            return;
        }
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n <= 0 || n > sz) {
            return;
        }
        if (n == sz) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return;
        }

        int i = 1;
        int iToFind = sz - n + 1;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        Node toDelete = prev.next;
        size--;
        prev.next = toDelete.next;

        if (toDelete.next != null) {
            toDelete.next.prev = prev;
        } else {
            tail = prev;
        }
    }

    // reverse a doubly linked list
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addInMiddle(2, 5);
        dll.addLast(4);

        dll.print();
        System.out.println("size of doubly linked list is : " + size);

        dll.removeNthNode(2);
        dll.print();
        System.out.println("size of doubly linked list is : " + size);

        // dll.removeFirst();
        // dll.removeLast();
        // dll.print();
        // System.out.println("size of doubly linked list is : " + size);
    }
}
