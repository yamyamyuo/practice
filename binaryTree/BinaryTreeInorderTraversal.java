/**
Depth First Traversals:
(a) Inorder (Left, Root, Right) : 4 2 5 1 3
(b) Preorder (Root, Left, Right) : 1 2 4 5 3
(c) Postorder (Left, Right, Root) : 4 5 2 3 1

Breadth First or Level Order Traversal : 1 2 3 4 5
// 不管对于哪种order traversal，当你走到最左的叶子节点的时候，还把它当做root来看，
什么时候输出这个root.val就是各个order之间的差异
*/

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

    public void dfs(TreeNode root, List<Integer> path, Stack<TreeNode> stk) {
        // this method is similar to recursive solution
        while (root!= null || !stk.isEmpty()) { // if(root == null) return;
            while (root != null) { // dfs(root.left);
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            path.add(root.val); //path.add
            root = root.right; // dfs(root.right);
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> path = new ArrayList<>();
        if (root == null)
            return path;
        Stack<TreeNode> stk = new Stack<>();
        dfs(root, path, stk);
        return path;

    }
}
