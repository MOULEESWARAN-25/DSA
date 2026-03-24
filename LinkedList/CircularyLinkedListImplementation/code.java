package LinkedList.CircularyLinkedListImplementation;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

class CirucularLinkedList {
    Node head;
    Node tail;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.println(curr.data);
            curr = curr.next;
        } while (curr != head);
    }
}

public class code {
    public static void main(String[] args) {
        CirucularLinkedList cll = new CirucularLinkedList();
        cll.add(10);
        cll.add(70);
        cll.add(78);
        cll.add(91);
        cll.add(73);
        cll.add(84);
        cll.add(69);
        cll.display();
    }
}