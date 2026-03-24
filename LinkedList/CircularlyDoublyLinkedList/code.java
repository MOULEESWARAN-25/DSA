package LinkedList.CircularlyDoublyLinkedList;

class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
    }
}

class DLL {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public void displyFront() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node front = head;
        do {
            System.out.println(front.data);
            front = front.next;
        } while (front != head);
    }

    public void displayBack() {
        if (tail == null) {
            System.out.println("List is empty");
            return;
        }

        Node back = tail;
        do {
            System.out.println(back.data);
            back = back.prev;
        } while (back != tail);
    }
}

public class code {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.add(93);
        dll.add(94);
        dll.add(95);
        dll.add(96);
        dll.add(97);
        dll.add(90);

        dll.displayBack();
        dll.displyFront();
    }
}