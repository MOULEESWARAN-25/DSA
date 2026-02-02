/*Definition of singly linked list:
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
 */

class Solution {
    int found = 0;
    ListNode rightMove;
    public void reverseCheck(ListNode start, int count){
        if(count > 0){
            reverseCheck(start.next, count - 1);
        }
        if(start.val != rightMove.val) found = 1;
        rightMove = rightMove.next;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode start = head;
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        if(fast == null){
            rightMove = slow;
            reverseCheck(start, count - 1);
            return found == 0;
        }
        rightMove = slow.next;
        reverseCheck(start, count - 1);
        return found == 0;
    }
}
