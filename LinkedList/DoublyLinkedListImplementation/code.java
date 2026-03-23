package LinkedList.DoublyLinkedListImplementation;

import java.util.*;

class DoublyLinkedList {
    DoublyLinkedList next;
    DoublyLinkedList prev;
    int data;

    DoublyLinkedList(int data) {
        this.data = data;
    }
}

public class code {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<>(Arrays.asList(10, 50, 30, 60, 45, 88));

        DoublyLinkedList head = new DoublyLinkedList(values.get(0));
        DoublyLinkedList current = head;

        for (int i = 1; i < values.size(); i++) {
            DoublyLinkedList newNode = new DoublyLinkedList(values.get(i));

            current.next = newNode;
            newNode.prev = current;

            current = newNode;
        }

        DoublyLinkedList temp = head;
        while (temp != null) {
            if (temp.prev == null) {
                System.out.print("null");
            } else {
                System.out.print(" -> " + temp.prev.data);
            }
            temp = temp.next;
        }
    }
}