/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int sum(TreeNode root, int sum) {
      if (root == null)
        return 0;
      if (root.left == null && root.right == null)
        return sum*10+root.val;
      return sum(root.left, root.val + sum*10) + sum(root.right, root.val + sum*10);
    }
    public int sumNumbers(TreeNode root) {
      return sum(root, 0);
    }
}
