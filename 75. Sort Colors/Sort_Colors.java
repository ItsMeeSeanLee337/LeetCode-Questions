class Solution {
    public void sortColors(int[] nums) 
    {
        //We will implement quick sort to solve this problem
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high)
        {
            //If the mid's element is 0, we swap mid's element with low's element
            if (nums[mid] == 0)
            {   
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
            }
            //If the mid's element is 2, we swap mid's element with high's element
            if (nums[mid] == 2)
            {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
                mid--;
            }
            //We increment mid after checking these two conditions
            mid++;
        }
    }
}