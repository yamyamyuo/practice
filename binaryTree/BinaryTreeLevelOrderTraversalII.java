// 这道题可以使用level order traversal加上递归的方式去做
// 递归可以先进入到最底层，level order则可以将一层的结果输出。一整层的递归
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
    public void helper(List<TreeNode> level) {
        List<TreeNode> nextLevel = new ArrayList<>();
        //如果数组为空则需要跳出递归了
        if (level==null || level.size() == 0)
            return ;
        level.forEach(root -> {
            if (root.left!=null) nextLevel.add(root.left);
            if (root.right!=null) nextLevel.add(root.right);
        });

        helper(nextLevel);
        List<Integer> result = new ArrayList<>();
        //这里是level在继续forEach，不是nextLevel
        level.forEach(root -> {
            result.add(root.val);
        });

        res.add(result);
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return res;
        List<TreeNode> level = new ArrayList<>();
        level.add(root);
        helper(level);
        return res;
    }
}
