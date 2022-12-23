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
    public boolean isSymmetric(TreeNode root) 
    {
        //if the root node has no children, the tree will be symmetric
        if (root.left == null && root.right == null)
        {
            return true;
        }
        else
        {
            return symmetricHelper(root.left, root.right);
        }
    }
    public boolean symmetricHelper(TreeNode left, TreeNode right)
    {
        //f the left node is null or the right node is null, then the function will only return true if both left and right are the same
        if (left == null || right == null)
        {
            return left == right;
        }
        //We must also compare the values of the left node and right node in the case that neither are null
        if (left.val != right.val)
        {
            return false;
        }
        //If both the left and right nodes are equal, we use recursion to compare left.left and right.right and also left.right and right.left
        return symmetricHelper(left.left, right.right) && symmetricHelper(left.right, right.left);
    }
}