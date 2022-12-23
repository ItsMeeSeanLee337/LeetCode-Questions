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
class Solution 
{
    //Create a global treenode called previous to keep track of previous nodes we have gone to
    TreeNode previous = null;
    public boolean isValidBST(TreeNode root) 
    {
        //DFS method of solving: search through the tree and see if the current node's value is greater than the previous node's value
        //Base case where the root is null, meaning that we can 
        if(root == null) 
        {
            return true;
        }
        if(isValidBST(root.left) && (previous == null || root.val > previous.val)) 
        {
            previous = root;
            return isValidBST(root.right);
        }
        return false;
    }
}