import java.util.Scanner;

public class LinkedList {
    static class Node {
        int data;
        Node next;
        Node prev;
        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    static class SinglyLinkedList {
        Node head;
        Node tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        void insertNode(int data) {
            Node node = new Node(data);
            if (head == null) {
                head = node;
            } else {
                tail.next = node;
                node.prev = tail;
            }
            tail = node;
        }

        void deleteNode(int data) {

        }

        void insertionSort() {
            if (head == null || head.next == null) return;
            int i = 0;
            int value;
            Node current = head.next;
            while (current != null) {
                Node p = current;
                value = current.data;
                while (p.prev != null && p.prev.data > value) {
                    p.data = p.prev.data;
                    p = p.prev;
                }
                p.data = value;
                current = current.next;
            }
        }

        void print() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SinglyLinkedList linkedList = new SinglyLinkedList();
        for (int i = 0; i<n; i++) {
            linkedList.insertNode(scanner.nextInt());
        }
        linkedList.insertionSort();
        linkedList.print();
    }
}
