# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def zigzagLevelOrder(self, root):
        """
        :type root: TreeNode
        :rtype: List[List[int]]
        """
        # If the root is empty, return an empty list
        if not root:
            return []
        # To solve this problem we will use a double ended queue
        queue = collections.deque([root])
        ans = []
        # We will also use the variable "even_level" to keep track of which level we are on
        even_level = False
        # While the double ended queue still has nodes to process
        while queue:
            # We create a "level" variable to put all nodes on the same level into our "ans" list
            level = []
            for i in range(len(queue)):
                # If we are on an even level, pop from the right and append from the left
                if even_level:
                    node = queue.pop()
                    # To maintain the order of the nodes in the form [L, R, L, R], we will push right first since we are appending from the left
                    if node.right:
                        queue.appendleft(node.right)
                    if node.left:
                        queue.appendleft(node.left)
                # If we are on an odd level, pop from the left and append from the right
                else: 
                    node = queue.popleft()
                    # We will append accordingly to where the node is and the format of [L, R, L, R] will be maintained
                    if node.left:
                        queue.append(node.left)
                    if node.right:
                        queue.append(node.right)
                # Append the node's value onto the "level" variable
                level.append(node.val)
            # Append the "level" list onto the "ans" list
            ans.append(level)
            # Change the "even_level" variable to it's opposite
            even_level = not even_level
        return ans