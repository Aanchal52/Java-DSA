package linkedlist;

public class LinkedListImplementation {

    public static class Node {
        int data;
        Node next;
    }

    public static class GenerateLL {
        Node head;
        Node tail;
        int size;

        void addLast(int value) {
            Node nayaNode = new Node();
            nayaNode.data = value;
            nayaNode.next = null;

            if (size == 0) {
                head = tail = nayaNode;
            } else {
                tail.next = nayaNode;
                tail = nayaNode;
            }
            size++;
        }

        void addFirst(int value) {
            Node nayaNode = new Node();
            nayaNode.data = value;
            nayaNode.next = head;
            head = nayaNode;
            if (size == 0) {
                tail = nayaNode;
            }
            size++;
        }

        
    }
}