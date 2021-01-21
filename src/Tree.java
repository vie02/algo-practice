import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void printInOrder(Node root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.print(root.data + " ");
            printInOrder(root.right);
        }
    }

    static void printBFT(Node root) {
        if (root != null) {
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                System.out.print(node.data + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
    }

    static Node searchRecur(Node root, int data) {
        if (root == null) {
            return null;
        }
        if (root.data == data) {
            return root;
        }
        if (data < root.data) {
            return searchRecur(root.left, data);
        }
        return searchRecur(root.right, data);
    }

    static Node searchIter(Node root, int data) {
        Node current = root;
        while (current != null && current.data != data) {
            if (data < current.data) {
                current = current.left;
            }
            current = current.right;
        }
        return current;
    }

    static Node insertNodeRecur(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertNodeRecur(root.left, data);
        } else {
            root.right = insertNodeRecur(root.right, data);
        }
        return root;
    }

    static void insertNodeIter(Node root, int data) {
        if (root == null) {
            return;
        }
        Node current = root;
        Node leaf = null;
        while (current != null) {
            if (current.data == data) {
                return;
            }
            leaf = current;
            if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        if (data < leaf.data) {
            leaf.left = new Node(data);
        } else {
            leaf.right = new Node(data);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(4);
        insertNodeIter(root, 2);
        insertNodeIter(root, 6);
        insertNodeIter(root, 1);
        insertNodeIter(root, 3);
        insertNodeIter(root, 5);
        insertNodeIter(root, 7);
        printInOrder(root);
        System.out.println();
        printBFT(root);
        System.out.println();
        System.out.println(searchIter(root, 6).left.data);
    }
}
