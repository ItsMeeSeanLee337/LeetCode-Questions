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
    public List<Integer> preorderTraversal(TreeNode root) 
    {
        //If the root node is null, return the arraylist as is
        if (root == null)
        {
            return returnList;
        }
        //If not, call the preordr function to recursively search the tree for nodes to add
        else
        {
            preorder(root);
            return returnList;
        }
    }
    public void preorder(TreeNode root)
    {
        //If the root node is null, end the preorder function
        if (root == null)
        {
            return;
        }
        //If not, we add the root node to the arraylist
        else
        {
            returnList.add(root.val);
            //We first search the left side of the tree to add into the arraylist
            preorder(root.left);
            //After searching the left, we do the same with the right
            preorder(root.right);
            return;
        }
    }
}