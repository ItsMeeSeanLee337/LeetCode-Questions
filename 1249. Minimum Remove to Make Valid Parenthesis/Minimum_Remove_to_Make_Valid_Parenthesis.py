class Solution(object):
    def minRemoveToMakeValid(self, s):
        """
        :type s: str
        :rtype: str
        """
        #To solve this problem we will use a stack
        stack = []
        #Convert the string "s" into a list since Strings in python are immutable
        s = list(s)
        #Iterate through "s"
        for i, character in enumerate(s):
            #If the character is '(', append the index to the stack
            if character == '(':
                stack.append(i)
            #If the character is ')'
            elif character == ')':
                #And if the stack is not empty, pop the top of the stack
                if stack:
                    stack.pop()
                #Otherwise, set the element at the index to ''
                else:
                    s[i] = ''
        #While the stack is not empty, set the elements for each index popped from the stack to ''
        while stack:
            s[stack.pop()] = ''
        #Rejoin the list to make "s" a string again and return it
        return ''.join(s)