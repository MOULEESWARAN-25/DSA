package LinkedList;

import java.util.*;

class ListNode {
    ListNode next;
    int data;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {
    public void traverse(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode trav = head;

        while (trav != null) {
            list.add(trav.data);
            trav = trav.next;
        }

        System.out.println(list);
    }
}

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);

        Solution sol = new Solution();
        sol.traverse(head);
    }
}