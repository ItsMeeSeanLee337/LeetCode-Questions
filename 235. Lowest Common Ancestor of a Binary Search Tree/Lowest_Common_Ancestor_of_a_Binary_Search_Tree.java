/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
    {
        //Find which TreeNode p or qis the minimum and maximum
        int minimum = Math.min(p.val, q.val);
        int maximum = Math.max(p.val, q.val);
        //Iterate through the nodes
        while (root != null)
        {
            //If root.val > maximum, then both p and q are in the left subtree, meaning we go left
            if (root.val > maximum)
            {
                root = root.left;
            }
            //If root.val < minimum, then both p and q are in the right subtree, meaning we go right
            else if (root.val < minimum)
            {
                root = root.right;
            }
            //In the case that minimum <= root.val <= large, the node we are looking at is the LCA between p and q
            else
            {
                return root;
            }
        }
        return null;
    }
}