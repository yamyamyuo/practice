/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// user level order traversal
public class Solution {
    public int minDepth(TreeNode root) {
        int minDepth = 0;
        if (root == null) return minDepth;
        Queue<TreeNode> queue = new LinkedList<>();// Queue is a interface
        queue.offer(root);
        TreeNode p;
        int len = queue.size();
        while (len!=0) {
            minDepth += 1;
            while (len!=0) {
                len--;
                p = queue.poll();
                if (p.left==null && p.right==null) return minDepth;
                if (p.left!=null) queue.offer(p.left);
                if (p.right!=null) queue.offer(p.right);
            }
            len = queue.size();
        }
        return minDepth;
    }
}
