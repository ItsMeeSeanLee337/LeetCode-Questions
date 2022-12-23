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
    public boolean hasPathSum(TreeNode root, int targetSum) 
    {
        //Base case where root is null, we return false
        if (root == null)
        {
            return false;
        }
        //We then cheak if the node is a leaf, and if that leaf is equal to the targetSum
        else if (root.left == null && root.right == null && root.val == targetSum)
        {
            return true;
        }
        //If the node is not a leaf or the node's value is not the target sum, we use recursion to check both left and right subnodes to see if they are leafs and if they are equal to the targetSum
        else
        {
            //We us targetSum - root.val to simulate adding the current node's value to a running sum
            return (hasPathSum(root.left, targetSum - root.val) ||hasPathSum(root.right, targetSum - root.val));
        }
    }
}