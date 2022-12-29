class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //threeSumSet is a set list of integers that we can use to store the triplets
        Set<List<Integer>> threeSumSet = new HashSet<>();
        //First sort the array
        Arrays.sort(nums);
        //We will do a 2 way sweep with three pointers
        //i will be the index we are looking at, j will look at the elemenet next to i, and k will look at the element at the end of the array
        for (int i = 0; i < nums.length - 2; i++)
        {
            int j = i + 1;
            int k = nums.length - 1;
            
            while (j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                //If sum == 0, we add that triplet to threeSumSet
                if (sum == 0)
                {
                    threeSumSet.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }
                //If sum > 0; we decrease the increment of k
                else if (sum > 0)
                {
                    k--;
                }
                //If sum < 0; we increase the increment of j
                else if (sum < 0)
                {
                    j++;
                }
                //We do not need to worry about duplicate triplets because adding into a set automatically checks the lists to make sure there are no duplicates
            }
        }
        //convert the set to an ArrayList and return
        return new ArrayList<>(threeSumSet);
    }
}