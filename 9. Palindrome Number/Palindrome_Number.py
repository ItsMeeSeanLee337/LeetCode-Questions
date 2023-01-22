class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        #If x is negative we return false 
        #In the case that x is positive and the final digit is 0, we cannot form a palindrome and should thus return false
        if x < 0 or (x > 0 and x % 10 == 0):
            return False
        #Create a copy of num and set it to inputNum
        inputNum = x
        #Create a reversedNum variable, setting it to 0
        reversedNum = 0
        #While x is greater than 0
        while x > 0:
            #Set reversedNum to reversedNum * 10 + the last digit of x
            reversedNum = reversedNum * 10 + x % 10
            #Use integer division on x to remove the last digit
            x = x // 10
        #If reversedNum is equal to the copy of x (inputNum), return true
        #Otherwise return false
        return reversedNum == inputNum