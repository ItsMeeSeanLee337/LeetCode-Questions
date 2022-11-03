class Solution {
    public int[] twoSum(int[] numbers, int target) 
    {
        int pointer1index = 0;
        int pointer2index = numbers.length - 1;
        while ((numbers[pointer1index] + numbers[pointer2index]) != target)
        {
            if ((numbers[pointer1index] + numbers[pointer2index]) < target)
            {
                pointer1index++;
            }
            else if ((numbers[pointer1index] + numbers[pointer2index]) > target)
            {
                pointer2index--;
            }
        }
        return new int[] {pointer1index + 1, pointer2index + 1};
    }
}