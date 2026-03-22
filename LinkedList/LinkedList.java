package LinkedList;

import java.util.*;

public class LinkedList {
    LinkedList next;
    int data;

    public LinkedList(int data) {
        this.data = data;
    }
}

class Solution {
    public void traverse(LinkedList head) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList trav = head;
        while (trav != null) {
            int val = trav.data;
            list.add(val);
        }
        System.out.println(list);
    }
}

class Main {
    public static void main(String[] args) {
        LinkedList Node = new LinkedList(5);
        Node.next = new LinkedList(3);
        Node.next.next = new LinkedList(7);
        Node.next.next.next = new LinkedList(2);
        Node.next.next.next.next = new LinkedList(4);

        Solution sol = new Solution();
        sol.traverse(Node);
    }
}