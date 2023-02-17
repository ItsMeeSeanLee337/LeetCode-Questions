class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        X = 0
        for str in operations:
            if str == "X++" or str == "++X":
                X += 1
            else:
                X -= 1
        return X