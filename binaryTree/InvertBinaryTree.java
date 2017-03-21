public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) return null;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}


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
    public TreeNode invertTree(TreeNode root) {
        if (null == root) return null;
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode node = stk.pop();
            TreeNode leftTemp = node.left;
            node.left = node.right;
            node.right = leftTemp;

            if (node.left!=null) stk.push(node.left);
            if (node.right!=null) stk.push(node.right);
        }
        return root;
    }
}
