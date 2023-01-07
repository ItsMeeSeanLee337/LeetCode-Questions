class Solution {
    public boolean increasingTriplet(int[] nums) 
    {
        //To solve this problem we will intialize two variables: the first minimum value min until now and the second minimum value from the first minimum value's position until now
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int num : nums)
        {
            //We iterate through the array and look for a third minimum value that is larger than the first and second minumum values at the same time, if so we return true, otherwise we change firstMin or secondMin according to whichever num is greater than
            if (num <= firstMin)
            {
                firstMin = num;
            }
            else if (num < secondMin)
            {
                secondMin = num;
            }
            else if (num > secondMin)
            {
                return true;
            }
        }
        return false;
    }
}