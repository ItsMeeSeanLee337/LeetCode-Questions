class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {
        if (ransomNote.length() > magazine.length())
        {
            return false;
        }
        //Create a counter with the size of the alphabet
        int[] counter = new int[26];
        //Increment through magazazine to add to the counter for each character we encounter
        //In ascii if you subtract any char with 'a' , it gives you index of that alphabet
        for (char c : magazine.toCharArray())
        {
            //We want to increment the index of that character by one
            //This is to indicate that we have encountered that character
            counter[c - 'a']++;
        }
        //Now we must check if we have enough of the right characters to create the ransom note
        for (char c : ransomNote.toCharArray())
        {
            //If the character we encounter when iterating through ransomNote has a counter of 0, that means that the character was not used in magazine and the function should return false because we are missing a letter to build the ransom note
            if (counter[c - 'a'] == 0)
            {
                return false;
            }
            //If the character we encounter does not have a counter of 0, decrement the count
            else
            {
                counter[c- 'a']--;
            }
        }
        //If we can loop through ransomNote and have enough characters, we return true
        return true;
    }
}