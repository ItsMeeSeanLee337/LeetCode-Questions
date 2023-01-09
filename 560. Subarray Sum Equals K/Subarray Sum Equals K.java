class Solution {
    public int subarraySum(int[] nums, int k) 
    {
        //To solve this problom, we will create an array that has each index defnied as the sum of all indices up that that index
        int count = 0;
        int[] sums = new int[nums.length + 1];
        //We first set sum[0] = 0 to insure we do not encounter an indexOutOfBounds exception when nums has a length of 0
        sums[0] = 0;
        for (int i = 1; i <= nums.length; i++)
        {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        //After filling the array, we iterate through the entire array to calculate the sum of the sub array
        for (int start = 0; start < sums.length; start++)
        {
            for (int end = start + 1; end < sums.length; end++)
            {
                //If the sum of the sub array is equal to k, we iterate the count
                if (sums[end] - sums[start] == k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}