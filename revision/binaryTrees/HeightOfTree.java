package revision.binaryTrees;

public class HeightOfTree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int leftDiameter = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiameter = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;
        return Math.max(selfDiameter, Math.max(rightDiameter, leftDiameter));
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftCount = countNode(root.left);
        int rightCount = countNode(root.right);

        return leftCount + rightCount + 1;
    }

    public static int nodeSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = nodeSum(root.left);
        int rightSum = nodeSum(root.right);

        return leftSum + rightSum + root.data;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Max height is : " + height(root));
        System.out.println("Diameter of tree is : " + diameter(root));
        System.out.println("Total no. of nodes is : " + countNode(root));
        System.out.println("Sum of all the Node is : " + nodeSum(root));
    }
}
