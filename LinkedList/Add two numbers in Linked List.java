package LinkedList;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.data + l2.data + carry;
            carry = 0;
            if (sum > 9) {
                carry++;
                temp.next = new ListNode(sum - 10);
                temp = temp.next;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null && carry == 1) {
            temp.next = new ListNode(carry);
            return result.next;
        }
        while (l1 != null) {
            int sum = l1.data + carry;
            carry = 0;
            if (sum > 9) {
                carry++;
                temp.next = new ListNode(sum - 10);
                temp = temp.next;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            l1 = l1.next;
        }
        while (l2 != null) {
            int sum = l2.data + carry;
            carry = 0;
            if (sum > 9) {
                carry++;
                temp.next = new ListNode(sum - 10);
                temp = temp.next;
            } else {
                temp.next = new ListNode(sum);
                temp = temp.next;
            }
            l2 = l2.next;
        }
        if (carry == 1)
            temp.next = new ListNode(carry);
        return result.next;
    }
}

// Edge cases :

// 1. 9 9 9 9 
//    9 9 9 9
//    8 9 9 9 1

//    9 + 9 + 0 (carry) = 18
//    carry = 1
//    remaining  = 8   8

//    9 + 9 + 1 = 19
//    carry = 1
//    remaining = 9    8 9

//    9 + 9 + 1 = 19
//    carry = 1
//    remaining = 9    8 9 9

//    9 + 9 + 1 = 19
//    carry = 1
//    remaining = 9    8 9 9 9

//    at the end carry should be check if it contains 1 it should be added atlast of the linked list


// 2. 9 9
//    9 
//    8 0 1

//    9 + 9 + 0 = 18
//    carry = 1
//    remaining = 8    8

//    9 + 1 = 10
//    carry = 1
//    remaining = 0    8 0

//    carry is added => 8 0 1
//    here there is is no more number for addition, so add the remaining atlast of the linked list, but here the carry should be check, if it is 1, the one also should be added