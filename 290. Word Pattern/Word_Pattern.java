class Solution {
    public boolean wordPattern(String pattern, String s) 
    {
        //Split the string into a string array based off of the words
        String words[] = s.split(" ");
        //If the length of the words array is not the same as the length of the pattern, return false
        if (words.length != pattern.length())
        {
            return false;
        }
        //Create two HashMaps, the first HashMap will assing the characters of the pattern string with words, the second HashMap will mark which words have been used
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();
        //Iterate through the pattern
        for (int i = 0; i < pattern.length(); i++)
        {
            //Instantiate variable ch as the element at index i in the pattern
            char ch = pattern.charAt(i);
            //If the pattern character has not been mapped:
            if (map1.containsKey(ch) == false)
            {
                //But the word which we will assign to character i has been used, we will return false
                if (map2.containsKey(words[i]) == true)
                {
                    return false;
                }
                //Otherwise we will mark the word at index i as used and put the character-word pair into map1
                else
                {
                    map2.put(words[i], true);
                    map1.put(ch, words[i]);
                }
            }
            //If the character has already been mapped, we must check what word that character has been mapped to
            else
            {
                String mWith = map1.get(ch);
                //If the word the character has been mapped with is not the same as words[i]
                if (mWith.equals(words[i]) == false)
                {
                    //That means the character has already been mapped with a character and we must return false
                    return false;
                }
            }
        }
        return true;
    }
}