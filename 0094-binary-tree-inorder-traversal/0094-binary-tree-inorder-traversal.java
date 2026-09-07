/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> vals = new ArrayList<>();
        inorder(root, vals);

        return vals;
    }

    public static int inorder(TreeNode node, List<Integer> vals)
    {
        if(node == null)
        {
            return 0;
        }

        inorder(node.left, vals);
        vals.add(node.val);
        inorder(node.right, vals);

        return 0;
    }
}