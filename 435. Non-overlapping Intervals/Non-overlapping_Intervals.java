class Solution {
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        int count = 0;
        //Check for a valid input, if the input is invalid we return the count as is
        if (intervals.length == 0)
        {
            return count;
        }
        //To find which intervals are overlapping we first sort the intervals:
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
        
        int end = intervals[0][1];
        int beginning;
        for (int i = 1; i < intervals.length; i++)
        {
            //Then check to see if the end of the interval we are inspecting is greater than the beginning of the next interval
            beginning = intervals[i][0];
            if (end > beginning)
            {
                //If so, we increment count and set the end to whichever ending is smaller;
                end = Math.min(end, intervals[i][1]);
                count++;
            }
            //If the end of the interval we are inspecting is not greater than the beginning of the interval we will set end to the ending of the next interval
            else
            {
                end = intervals[i][1];
            }
        }
        //Once we have iterated through all intervals we will return the count, the value of count will remain 0 if there are no overlapping intervals
        return count;
    }
}