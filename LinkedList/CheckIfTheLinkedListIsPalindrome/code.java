package LinkedList.CheckIfTheLinkedListIsPalindrome;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class code {
    public boolean isPalindrome(ListNode head) {
        ListNode trav = head;
        ListNode midNode = head;
        while (trav != null && trav.next != null) {
            trav = trav.next.next;
            midNode = midNode.next;
        }
        if (trav != null) {
            midNode = midNode.next;
        }
        ListNode rev = null;
        while (midNode != null) {
            ListNode temp = midNode.next;
            midNode.next = rev;
            rev = midNode;
            midNode = temp;
        }
        while (rev != null) {
            if (rev.val != head.val) {
                return false;
            }
            rev = rev.next;
            head = head.next;
        }
        return true;
    }
}