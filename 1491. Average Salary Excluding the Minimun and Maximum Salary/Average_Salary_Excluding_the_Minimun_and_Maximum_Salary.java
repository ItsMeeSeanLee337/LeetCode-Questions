class Solution {
    public double average(int[] salary) 
    {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        //find max and min for salary
        for (int i = 0; i < salary.length; i++)
        {
            if (salary[i] < low)
            {
                low = salary[i];
            }
            if (salary[i] > high)
            {
                high = salary[i];
            }
        }
        //calculate average
        int sum = 0;
        for (int j = 0; j < salary.length; j++)
        {
            if (salary[j] != low && salary[j] != high)
            {
                sum += salary[j];
            }
        }
        
        double average = (double) sum/(salary.length - 2);
        return average;
    }
}