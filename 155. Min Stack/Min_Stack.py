class MinStack(object):
    
    def __init__(self):
        #Use "array" to store elements and "min" to store the minimum element so far
        self.array = []
        self.min = []

    def push(self, val):
        """
        :type val: int
        :rtype: None
        """
        self.array.append(val)
        #Append x if self.min is empty, otherwise append whichever value is lower
        if not self.min:
            self.min.append(val)
        else:
            lower = min(val, self.min[-1])
            self.min.append(lower)

    def pop(self):
        """
        :rtype: None
        """
        self.array.pop()
        self.min.pop()
        

    def top(self):
        """
        :rtype: int
        """
        return self.array[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.min[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()