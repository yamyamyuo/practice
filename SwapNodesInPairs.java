/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode second = dummy;
        dummy.next = head;
        ListNode first = head;
        while (first!=null && first.next != null) {
            second.next = first.next;
            first.next = first.next.next;
            second.next.next = first;
            
            second = first;
            first = first.next;
        }
        return dummy.next;
    }
}
