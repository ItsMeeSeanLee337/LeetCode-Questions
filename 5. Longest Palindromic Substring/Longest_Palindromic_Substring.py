class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        result = ""
        for i in range(len(s)):
            #Odd case: "aba"
            temp = self.helper(s, i, i)
            if len(temp) > len(result):
                result = temp
            #Even case, "abba"
            temp = self.helper(s, i, i + 1)
            if len(temp) > len(result):
                result = temp
        return result
            
    #The helper function gets the longest palindrome, the function goes from inside to outside to find the length of the palindrome
    def helper (self, s, l, r):
        while l >= 0 and r < len(s) and s[l] == s[r]:
            l -= 1
            r += 1
        return s[l + 1: r]