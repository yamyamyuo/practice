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
    int max = Integer.MIN_VALUE;//可以使用全局的变量
    public int maxPathSum(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return max;
    }

    public int helper(TreeNode root) {
        if (root == null) return 0;
        int lmax = 0, rmax = 0, val = root.val;//必须在每次recursive调用的时候重新初始化

        lmax = Math.max(helper(root.left), 0);
        rmax = Math.max(helper(root.right), 0);
        max = Math.max(max, val + lmax + rmax);//计算整棵树的最大值
        return Math.max(val, Math.max(val+lmax, val+rmax));//计算每个小节点的最大值
    }
}
