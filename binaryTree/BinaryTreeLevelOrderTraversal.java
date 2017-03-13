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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        List<TreeNode> queue = new ArrayList<>();

        if (root == null) return res;
        queue.add(root);
        int len = queue.size();
        TreeNode p;
        while (len!=0) {// in this while loop, move to the next level
            while (len!=0) {// in this while loop, output all the node in the same level
                len--;
                p = queue.get(0);
                level.add(p.val);
                queue.remove(0);
                if (p.left != null) queue.add(p.left);
                if (p.right != null) queue.add(p.right);
            }
            len = queue.size();
            res.add(new ArrayList(level));
            level.clear();

        }
        return res;
    }
}
