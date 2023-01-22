class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        #Initialize a dictionary to act as a HashMap
        HashMap = {}
        #Iterate through all the values in the list nums:
        for index, value in enumerate(nums):
            #Set remainder to target - nums[index]
            remainder = target - value
            #If the remainder is in the HashMap, we have found our pair
            if remainder in HashMap:
                #Return the current index and the index of our remainder
                return[index, HashMap[remainder]]
            #Otherwise the remainder is not in the HashMap, create a key value pair
            #The key will be nums[index] (value) and the value will be the index number
            else:
                HashMap[value] = index
