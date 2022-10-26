class Solution {
    public int firstUniqChar(String s) 
    {
        //Hashset implementation
        HashSet<Character> used = new HashSet<Character>();
        //for every character c in string s
        for (char c : s.toCharArray())
        {
            //If the character has not been used before and can be added to the hashset, set the return integer to the index of c
            if (used.add(c))
            {
                int index = s.indexOf(c);
                int lastIndex = s.lastIndexOf(c);
                //If the index we are looking at is the last occurence of that character, return that index
                if (index == lastIndex)
                {
                    return index;
                }
            }
        }
        //If every character is used more than once, return -1
        return -1;
    }
}