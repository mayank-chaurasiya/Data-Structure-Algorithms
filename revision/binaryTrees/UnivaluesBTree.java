package revision.binaryTrees;

public class UnivaluesBTree {
    static class Node {
        int data;
        Node left, right;
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    public static boolean isUniValues(Node root, int val) {
        if (root == null) {
            return true;
        }

        if (val < 0) {
            val = root.data;
        }

        return root.data == val && isUniValues(root.left, val) && isUniValues(root.right, val);
    }

    public static void main(String[] args) {
        Node root = newNode(2);
        root.left = newNode(2);
        root.right = newNode(2);
        root.left.left = newNode(2);
        root.left.right = newNode(2);
        root.right.left = newNode(2);
        root.right.right = newNode(2);

        int val = -1;

        System.out.print(isUniValues(root, val));
    }
}
