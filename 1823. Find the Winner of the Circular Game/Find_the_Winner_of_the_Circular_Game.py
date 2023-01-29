class Solution(object):
    def findTheWinner(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: int
        """
        #Create a "friendsList" starting from 1 to "n" + 1 
        friendsList = list(range(1, n + 1))
        #Intialize a "start" variable to 0
        start = 0
        #While the length of the "friendsList" is greater than 1
        while len(friendsList) > 1:
            #Set the loser to the remainder of "start" + "k" - 1
            loser = (start + k - 1) % len(friendsList)
            #Delete the "loser" from the "friendsList"
            del friendsList[loser]
            #If the "loser" was less than the length of the "friendsList" we will start from the loser
            if loser <= len(friendsList):
                start = loser
            else:
            #Otherwise we start from 0
                start = 0
        #Return the only person left in the "friendsList"
        return friendsList[0]