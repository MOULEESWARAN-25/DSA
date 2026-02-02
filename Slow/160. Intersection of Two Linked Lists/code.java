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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> visited = new HashSet<>();
        while(headA != null && headB != null){
            if(visited.contains(headA)){
                return headA;
            }
            visited.add(headA);
            if(visited.contains(headB)){
                return headB;
            }
            visited.add(headB);
            headA = headA.next;
            headB = headB.next;
        }
        while(headA != null){
            if(visited.contains(headA)) return headA;
            headA = headA.next;
        }
        while(headB != null){
            if(visited.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;
    }
}
