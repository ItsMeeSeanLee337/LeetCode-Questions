class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #"threeSumSet" is a list of integer that we can use to store triplets
        threeSumSet = []
        #First sort the list nums
        nums.sort()
        #We will do a 2 way sweep with three pointers
        #"i" will be the index we are looking at, "j" will look at the element next to "i", and "k" will look at the elment at the end of the array
        for i in xrange(len(nums) - 2):
            #This if statement ensures that we do not insert duplicates into our list "threeSumSet"
            if i > 0 and nums[i] == nums[i-1]:
                continue
            j = i + 1
            k = len(nums) - 1
            while j < k:
                sum = nums[i] + nums[j] + nums[k]
                #If "sum" is 0, that means we have found a triplet and should accordingly add the triplet to the list "threeSumSet"
                if sum == 0:
                    threeSumSet.append((nums[i], nums[j], nums[k]))
                    #The bottom two while loops ensure that we do not enter a duplicate triplet
                    while j < k and nums[j] == nums[j+1]:
                        j += 1
                    while j < k and nums[k] == nums[k-1]:
                        k -= 1
                    j += 1
                    k -= 1
                #If the sum is greater than 0, we decrease the increment of k
                elif sum > 0:
                    k -= 1
                #If the sum is less than 0, we increase the increment of j
                elif sum < 0:
                    j += 1
        #return
        return threeSumSet