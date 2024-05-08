class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        # Create a dictionary to count the frequency of each element in 'nums'.
        countArray = {}
        # Create a list of lists where the index represents the frequency of elements.
        freq = [[] for i in range(len(nums) + 1)]

        # Populate 'countArray' with the frequency of each element.
        for num in nums:
            countArray[num] = 1 + countArray.get(num, 0)

        # Place each element from 'countArray' into the 'freq' list at the index corresponding to its frequency.
        for num, count in countArray.items():
            freq[count].append(num)

        # List to store the k most frequent elements.
        res = []
        # Traverse the 'freq' list in reverse to get the most frequent elements first.
        for i in range(len(freq) - 1, 0, -1):  # Start from the highest possible frequency.
            for n in freq[i]:  # For each element in the sublist at index i.
                res.append(n)  # Add the element to the result list.
                if len(res) == k:  # If we have collected k elements.
                    return res  # Return the result list.
