/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int t = n;
        ListNode p = head, q = head;
        while (t > 0) {
            if (p!=null)
                p = p.next;
            else
                return null;
            t--;
        }
        if (p == null)
            return head.next;
        while (p.next != null) {
            q = q.next;
            p = p.next;
        }
        q.next = q.next.next;
        return head;
    }
}
