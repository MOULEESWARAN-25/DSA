/*
Definition of singly linked list:
class ListNode{
    public int data;
    public ListNode next;
    ListNode() { data = 0; next = null; }
    ListNode(int x) { data = x; next = null; }
    ListNode(int x, ListNode next) { data = x; this.next = next; }
}
*/

class Solution {
    public ListNode sortList(ListNode head) {
        ListNode zeroHead = new ListNode(-1);
        ListNode oneHead = new ListNode(-1);
        ListNode twoHead = new ListNode(-1);
        ListNode zero = zeroHead;
        ListNode one = oneHead;
        ListNode two = twoHead;
        ListNode curr = head;
        while(curr != null){
            if(curr.data == 0){
                zero.next = curr;
                zero = zero.next;
            }else if(curr.data == 1){
                one.next = curr;
                one = one.next;
            }else{
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }
        two.next = null;
        if(oneHead.next != null){
            zero.next = oneHead.next;
            one.next = twoHead.next;
        }else{
            zero.next = twoHead.next;
        }
        return zeroHead.next;
    }
}
