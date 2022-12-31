class Solution {
    public int[][] merge(int[][] intervals) 
    {
        //First we sort the intervals
        Arrays.sort(intervals, (o1,o2) -> o1[0]-o2[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        //We find the initial range of the intervals
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++)
        {
            //We find the start and end of the interval we are currently looking at
            int s = intervals[i][0];
            int e = intervals[i][1];
            //If the start of the current interval is less than or equal to the end of our previous interval, we merge these two intervals
            if (s <= end)
            {
                end = Math.max(end,e);
            }
            //Otherwise, we insert the previous interval into the list
            else
            {
                ans.add(new int[]{start, end});
                start = s;
                end = e;
            }
        }
        ans.add(new int[] {start,end});
        return ans.toArray(new int[0][]);
    }
}