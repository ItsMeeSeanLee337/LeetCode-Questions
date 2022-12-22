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
    public int maxDepth(TreeNode root) 
    {
        //Breadth First Search (BFS) solution, 
        int depth = 0;
        //If the root node is null, return the arraylist as is
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
        {
            return depth;
        }
        else
        {
            Deque<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) 
            {
                int queueLength = queue.size();
                for (int i = 0; i < queueLength; i++) 
                {
                    TreeNode curr = queue.remove();
                    if (curr.left != null) 
                    {
                        queue.add(curr.left);
                    }
                    if (curr.right != null)
                    {
                        queue.add(curr.right);
                    }
                }
                depth++;
            }
            return depth;
        }
    }
}