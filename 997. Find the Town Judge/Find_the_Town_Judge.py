class Solution(object):
    def findJudge(self, n, trust):
        """
        :type n: int
        :type trust: List[List[int]]
        :rtype: int
        """
        #If the length of "trust" is 0 and there are "n" people, then the only person is the judge
        if len(trust) == 0 and n == 1:
            return 1
        #Initialize an empty array count of size "n" + 1 to keep track of the number of people that trust and are trusted by each person
        count = [0] * (n + 1)
        #Iterate through the trust array
        for person in trust:
            #For each pair of people, decrement the trust count of the first person and increment the trust count of the second person
            count[person[0]] -= 1
            count[person[1]] += 1
        #Iterate through the count array
        for person in range(len(count)):
            #For each person, check if their trust count is equal to "n" - 1, if so we return the person's index since that person is the judge
            if count[person] == n - 1:
                return person
        #If no such person exists, return "-1" since no judge exists
        return -1