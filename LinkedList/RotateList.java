/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // be aware of the corner case
        if (head == null||head.next == null) return head;

        int len = 1;
        ListNode tail = head;
        while (tail.next!=null) {
            tail = tail.next;
            len++;
        }

        tail.next = head; // make it a circle

        k = k % len;

        // let the rotate start at the tail
        // must start at the tail, which is one node before head. or else, we need to set i < len - k -1;
        for (int i = 0; i < len - k; i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}
