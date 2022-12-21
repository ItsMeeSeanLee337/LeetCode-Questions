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
    //Create a global arraylist that we can add to in the preorderTraversal method
    List<Integer> returnList = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        if (root == null)
        {
            return returnList;
        }
        else
        {
            inorder(root);
            return returnList;
        }
    }
    public void inorder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        else
        {
            inorder(root.left);
            returnList.add(root.val);
            inorder(root.right);
            return;
        }
    }
}