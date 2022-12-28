class Solution {
    public int majorityElement(int[] nums) 
    {
        //First we sort the array
        Arrays.sort(nums);
        //We iterate through the sorted array, counting how many times we have encountered a number
        //We return the number with the most number of encounters
        int currentNumberOfEncounters = 0;
        int previousMaxOfEncounters = 0;
        int majorityElement = 1;
        for (int i = 0; i < nums.length - 1; i++)
        {
            //If the number at index + 1 is not equal to the number at index, we reset the number of times we have encountered that number
            if (nums[i] != nums[i + 1])
            {
                currentNumberOfEncounters = 0;
            }
            //otherwise we iterate the number of times we have seen that number
            else
            {
                currentNumberOfEncounters++;
            }
            //If the current number of encounters is ever greater than the running max, we set the running max to our current number of encounters and set the majority element to the number we are looking at
            if (currentNumberOfEncounters > previousMaxOfEncounters)
            {
                previousMaxOfEncounters = currentNumberOfEncounters;
                majorityElement = nums[i];
            }
        }
        return majorityElement;
    }
}