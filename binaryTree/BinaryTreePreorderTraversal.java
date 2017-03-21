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
    public void dfs(TreeNode root, Stack<TreeNode> stk, List<Integer> path) {
        while (!stk.isEmpty() || root != null) {
            while (root!=null) {
                path.add(root.val);
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            root = root.right;
        }
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root == null)
            return path;
        Stack<TreeNode> stk = new Stack<>();
        dfs(root, stk, path);
        return path;
    }
}

//递归
public class Solution {
    public void dfs(TreeNode root, List<Integer> res) {
        if (root == null)
            return ;
        res.add(root.val);
        dfs(root.left,res);
        dfs(root.right,res);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        dfs(root, res);
        return res;

    }
}
