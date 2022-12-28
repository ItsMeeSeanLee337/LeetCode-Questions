class Solution {
    public int singleNumber(int[] nums) 
    {
        //We will first sort the integer array nums
        Arrays.sort(nums);
        //Then we check if the current number equals the number next to it
        //If the number is not the same as index + 1, we return that number as our answer
        for (int i = 0; i < nums.length - 1; i += 2)
        {
            if (nums[i] != nums[i + 1])
            {
                return nums[i];
            }
        }
        //If we run through the array and do not return any number, that means that our answer is the largest value in the array
        return nums[nums.length - 1];
    }
}