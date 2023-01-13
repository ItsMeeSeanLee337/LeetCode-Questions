class Solution {
    public List<Integer> partitionLabels(String s) 
    {
        Map<Character, Integer> map = new HashMap<>();
        //Filling the impact of each character in the string
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        //Making and filling the return list
        List<Integer> res = new ArrayList<>();
        int previous = -1;
        int maximum = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            maximum = Math.max(maximum, map.get(ch));
            if (maximum == i)
            {
                // If the maximum is equal to the index, we insert the partition length into the return list
                res.add(maximum - previous);
                previous = maximum;
            }
        }
        return res;
    }
}