class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int numsLess = 0;
        for (int i = 0; i < nums.length; i++)
        {
            numsLess = 0;
            for (int j = 0; j < nums.length; j++)
            {
                if (nums[j] < nums[i] && i != j)
                {
                    numsLess++;
                }
            }
            ans[i] = numsLess;
        }
        return ans;
    }
}