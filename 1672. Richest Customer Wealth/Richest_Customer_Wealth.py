class Solution(object):
    def maximumWealth(self, accounts):
        """
        :type accounts: List[List[int]]
        :rtype: int
        """
        highest = 0
        currentHighest = 0
        for customer in accounts:
            for bank in customer:
                currentHighest += bank
            if currentHighest > highest:
                highest = currentHighest
            currentHighest = 0
        return highest