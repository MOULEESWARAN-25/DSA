package LinkedList.ReverseALinkedList2;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class code {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right)
            return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        ListNode swap = curr;
        ListNode rev = null;
        for (int i = 0; i <= right - left; i++) {
            ListNode temp = curr.next;
            curr.next = rev;
            rev = curr;
            curr = temp;
        }
        prev.next = rev;
        swap.next = curr;
        // System.out.println(rev.val);
        return dummy.next;
    }
}