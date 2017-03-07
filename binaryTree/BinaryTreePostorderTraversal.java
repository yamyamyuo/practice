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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root == null)
            return path;
        Stack<TreeNode> stk = new Stack<>();
        TreeNode pre = null;

        do {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            pre = null;
            while (!stk.isEmpty()) {
                root = stk.pop();
                if (root.right == pre) {
                  path.add(root.val);
                  pre = root;
                } else {
                  stk.push(root);
                  root = root.right;
                  break;
                }
            }
        } while (!stk.isEmpty())
        return path;
    }

}


public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        // mark的初始化不能为null，否则有test case 不通过
        TreeNode mark = root;
        if (root != null)
            stk.push(root);

        while (!stk.isEmpty()) {
            root = stk.peek();
            if ((root.left == null && root.right == null) || root.left == mark || root.right == mark ) {
                path.add(root.val);
                stk.pop();
                mark = root;
            } else {
                if (root.right != null) stk.push(root.right);
                if (root.left != null) stk.push(root.left);
            }
        }


        return path;
    }

}
