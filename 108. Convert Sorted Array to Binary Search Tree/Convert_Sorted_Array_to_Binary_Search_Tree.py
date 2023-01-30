# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def sortedArrayToBST(self, nums):
        """
        :type nums: List[int]
        :rtype: TreeNode
        """
        total_nums = len(nums)
        if total_nums == 0:
            return None
        #Find the middle node and set that to the root node
        mid_node = total_nums // 2
        #After setting the root node, we find the middle element of the left subarray and the middle element of the right subarray
        return TreeNode(
            nums[mid_node],
            self.sortedArrayToBST(nums[:mid_node]), self.sortedArrayToBST(nums[mid_node + 1:]), 
        )