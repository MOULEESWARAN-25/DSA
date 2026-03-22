
class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

class Solution {
    int count;
    Node found;
    Node last;

    public void recursion(Node head) {
        if (head == null)
            return;
        if (head.next == null) {
            last = head;
        }
        recursion(head.next);
        if (count == 0)
            found = head;
        count--;
    }

    public void moveElements(Node head, int n) {
        count = n;
        recursion(head);
        if (found != null) {
            Node rev = found.next;
            found.next = null;
            // System.out.println(last.data);
            last.next = head;
            while (rev != null) {
                System.out.println(rev.data);
                rev = rev.next;
            }
        }
    }
}

public class code {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        head.next.next.next.next.next.next = new Node(70);

        Solution sol = new Solution();
        sol.moveElements(head, 5);
    }
}