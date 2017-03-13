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
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    // preorder traversal
    public void dfs(TreeNode root, int sum) {
        if (root == null) return ;

        path.add(root.val);
        dfs(root.left, sum - root.val);
        if (root.left == null && root.right == null && root.val == sum) {
            res.add(new ArrayList(path)); //prevent the reference changed the correct results
        }
        dfs(root.right, sum - root.val);
        path.remove(path.size()-1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if (root == null) return res;
        dfs(root, sum);
        return res;

    }
}
