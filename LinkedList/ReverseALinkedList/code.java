package LinkedList.ReverseALinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class code {
    public ListNode reverseList(ListNode head) {
        ListNode dummy = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = dummy;
            dummy = curr;
            curr = temp;
        }
        return dummy;
    }
}
