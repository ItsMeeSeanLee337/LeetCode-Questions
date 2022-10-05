class Solution {
    public int pivotIndex(int[] nums) 
    {
        int rightSum = 0;
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            //Right sum
            for (int j = i + 1; j < nums.length; j++)
            {
                rightSum += nums[j];
            }
            //left sum
            for (int k = 0; k < i; k++)
            {
                leftSum += nums[k];
            }
            if (rightSum == leftSum)
            {
                return i;
            }
            else
            {
                rightSum = 0;
                leftSum = 0;
            }
        }
        return (-1);
    }
}