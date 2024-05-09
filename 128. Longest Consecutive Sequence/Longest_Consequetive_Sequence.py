class Solution(object):
    def longestConsecutive(self, nums):
        # Check if the input list is empty; if so, return 0 as there are no numbers to form a sequence.
        if not nums:
            return 0
        
        # Sort the list in place; this makes consecutive elements appear next to each other.
        nums.sort()
        
        # Initialize `longest` to 1 since the minimum length of any sequence with at least one number is 1.
        longest = 1
        
        # Initialize `current_streak` to 1 to start counting a new sequence.
        current_streak = 1
        
        # Iterate over the list starting from the second element (index 1).
        for i in range(1, len(nums)):
            # Check if the current number is not a duplicate of the previous one.
            if nums[i] != nums[i - 1]:
                # Check if the current number is exactly one more than the previous number.
                if nums[i] == nums[i - 1] + 1:
                    # If so, increment the current streak as it is part of the consecutive sequence.
                    current_streak += 1
                else:
                    # If not consecutive, update the `longest` if the `current_streak` is greater.
                    longest = max(longest, current_streak)
                    # Reset the `current_streak` as we start counting a new sequence.
                    current_streak = 1
        
        # After exiting the loop, compare the last `current_streak` with `longest` to ensure the longest sequence is returned.
        return max(longest, current_streak)
