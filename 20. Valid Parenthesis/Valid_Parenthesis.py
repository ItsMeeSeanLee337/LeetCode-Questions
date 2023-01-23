
class Solution(object):
    def isValid(self, s):
        """
        :type s: str
        :rtype: bool
        """
        #intialize a list to act as a stack
        stack = []
        #iterate through each character in string "s"
        for char in s:
            #if the character we are inspecting is '(', '[', or '{', i.e. any of the opening brackets, append to the end of the stack
            if char == '(' or char == '[' or char == '{':
                stack.append(char)
            #if the character we are inspecting is ')', ']', or '}', i.e. any of the closing brackets, and the stack is empty, we will return false
            elif not stack:
                return False
            #if the character we are inspecting is ')', ']', or '}', i.e. any of the closing brackets, pop end of the stack. If the popped character is not the corresponding opening bracket, return false
            elif char == ')' and stack.pop() != '(':
                return False
            elif char == ']' and stack.pop() != '[':
                return False
            elif char == '}' and stack.pop() != '{':
                return False
        #If the stack is empty, return true
        if not stack:
            return True
        #Otherwise return false
        else:
            return False
            