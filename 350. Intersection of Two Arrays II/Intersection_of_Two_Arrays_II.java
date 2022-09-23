class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int pointer1 = 0;
        int pointer2 = 0;
        List<Integer> intersections = new ArrayList<>();
        while (true)
        {
            if (pointer1 >= nums1.length || pointer2 >= nums2.length)
            {
			    break;
		    }
            if (nums1[pointer1] == nums2[pointer2])
            {
                intersections.add(nums1[pointer1]);
                pointer1++;
                pointer2++;
            }
            else if (nums1[pointer1] < nums2[pointer2])
            {
                pointer1++;
            }
            else if (nums1[pointer1] > nums2[pointer2])
            {
                pointer2++;
            }
        }
        int[] returnArray = new int[intersections.size()];
        for (int i = 0; i < intersections.size(); i++)
        {
            returnArray[i] = intersections.get(i);
        }
        return returnArray;
    }
}