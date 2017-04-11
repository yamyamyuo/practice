/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 // 在linkedlist中，可以让当前节点不为空，也可以让cur.next 不为空
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode prev = head;
        int carry = 0;
        while (l1!=null || l2!=null || carry!=0) {
          ListNode cur = new ListNode(0);
          int sum = (l1==null ? 0:l1.val) + (l2==null? 0: l2.val) + carry;
          cur.val = sum%10;
          carry = sum/10;
          prev.next = cur;
          prev = prev.next;
          if (l1!=null) l1 = l1.next;
          if (l2!=null) l2 = l2.next;
        }
        return head.next;
    }
}
