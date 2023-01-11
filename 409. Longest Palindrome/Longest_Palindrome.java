class Solution {
    public int longestPalindrome(String s) 
    {
        int length = 0;
        //To solve this problem we will use a HashSet
        HashSet<Character> hashSet = new HashSet<Character>();
        //Traverse through every element in the input string
        for (int i = 0; i <s.length(); i++)
        {
            //Correctly type cast the element at i to a character to insert into the HashSet
            char character = s.charAt(i);
            //If the HashSet already contains the character, remove that character and increase the count of length by 2;
            //The HashSet containing the character means that we have a pair of characters we can use in a palindrome, thus why we increase length by 2
            if (hashSet.contains(character))
            {
                length += 2;
                hashSet.remove(character);
            }
            //Otherwise, add the character into the HashSet
            else
            {
                hashSet.add(character);
            }
        }
        //If we have any remaining characters with no duplicates after iterating through the string, we increase the length by 1
        if (hashSet.size() > 0)
        {
            length++;
        }
        return length;
    }
}