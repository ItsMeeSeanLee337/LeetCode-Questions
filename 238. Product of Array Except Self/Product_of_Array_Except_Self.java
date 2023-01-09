class Solution {
    public int[] productExceptSelf(int[] nums) 
    {
        int length = nums.length;
        int[] answer = new int[length];
        int leftMultiplier = 1;
        int rightMultiplier = 1;
        //To solve this problem we create the answer array and do two iterations
        //The initial iteration will go from right to left
        for (int i = length - 1; i>= 0; i--)
        {
            //First we set answer[i] = rightMultiplier
            answer[i] = rightMultiplier;
            //Then we mutliply rightMultiplier by nums[i]
            rightMultiplier *= nums[i];
            //Once completing these two operations we will iterate leftward through the array
        }
        //The next iteration will go from left to right
        for (int j = 0; j < length; j++)
        {
            //We multiply answer[j] with leftMultiplier
            answer[j] *= leftMultiplier;
            //Then we multiply leftMultiplier by nums[j]
            leftMultiplier *= nums[j];
            //Once completing these two operations we will iterate rightward through the array
        }
        //Finally we return the answer;
        return answer;
    }
}