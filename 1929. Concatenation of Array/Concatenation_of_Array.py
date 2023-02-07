class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # Trick in Python where you can return a list multiplied by "n" times to get a return list with "n" copies of the original list
        return nums * 2