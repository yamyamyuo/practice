/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1;
        ListNode p = l1;
        int carry = 0;
        while (l1.next!=null && l2.next!=null) {
            p.val = (l1.val + l2.val + carry)%10;
            carry = (l1.val + l2.val)/10;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        ListNode q = l1.next != null ? l1.next : l2.next;
        while (q.next!=null) {

        }

    }
}
