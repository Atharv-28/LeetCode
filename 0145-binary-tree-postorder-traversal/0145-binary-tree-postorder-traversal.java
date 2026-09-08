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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> post = new ArrayList<>();
        postorder(root, post);

        return post;
    }

    public static int postorder(TreeNode node, List post)
    {
        if(node == null)
        {
            return 0;
        }

        postorder(node.left, post);
        postorder(node.right, post);
        post.add(node.val);

        return 0;

    }
}