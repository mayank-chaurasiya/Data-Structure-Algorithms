package revision.LinkedList;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Methods to add()
    public void addFirst(int data) {
        Node newNode = new Node(data);// step 1 - create new node
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;// step 2 - newNode next = head
        head = newNode; // step 3 - head = newNode
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;

        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Methods to print()
    public void printLL() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Methods to remove()

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addLast(3);
        ll.printLL();
        ll.addLast(4);
        ll.printLL();

        ll.addInMiddle(2, 9);
        ll.printLL();

        System.out.println("Size of linked List : " + size);
    }
}
