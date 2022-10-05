class Solution {
    public int[] runningSum(int[] nums) 
    {
        int[] returnArray = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                sum += nums[j]; 
            }
            returnArray[i] = (nums[i] + sum);
            sum = 0;
        }
        return returnArray;
    }
}