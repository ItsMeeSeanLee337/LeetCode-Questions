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
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        //If the root node is null, return the arraylist as is
        if (root == null)
        {
            return returnList;
        }
        //If not, call the postorder function to recursively search the tree for nodes to add
        else
        {
            postorder(root);
            return returnList;
        }
    }
    public void postorder (TreeNode root)
    {
        //If the root node is null, end the postorder function
        if (root == null)
        {
            return;
        }
        else
        {
            postorder(root.left);
            postorder(root.right);
            returnList.add(root.val);
            return;
        }
    }
}