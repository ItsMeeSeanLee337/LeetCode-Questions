class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        x = nums[:n]
        y = nums[n:]
        ans = []
        for i in range(n):
            ans.append(x[i])
            ans.append(y[i])
        return ans