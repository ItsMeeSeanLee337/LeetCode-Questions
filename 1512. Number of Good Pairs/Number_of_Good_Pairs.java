class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = i + 1; j < nums.length; j++)
            {
                // No need to check if "i" < "j" since it will always be true
                if (nums[i] == nums[j])
                {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}