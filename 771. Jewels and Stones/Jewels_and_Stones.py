class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        ans = 0
        for characterJ in jewels:
            for characterS in stones:
                if characterJ == characterS:
                    ans += 1
        return ans