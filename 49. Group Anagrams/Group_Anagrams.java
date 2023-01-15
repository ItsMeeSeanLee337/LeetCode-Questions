class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        //To solve this problem we will use a HashMap
        Map<String, List<String>> hashMap = new HashMap<>();
        //We will iterate through all the strings in strs
        for (String s : strs)
        {
            //Convert the string into a character array
            char[] chars = s.toCharArray();
            //Sort the character array
            Arrays.sort(chars);
            //After sorting the character array, all anagrams of the word will have the same key value
            String key = String.valueOf(chars);
            //If the HashMap does not cotain the key value, insert that key value into the hashMap
            if (!hashMap.containsKey(key))
            {
                hashMap.put(key, new ArrayList<>());
            }
            //Insert the string s into the corresponding key value
            hashMap.get(key).add(s);
        }
        //Return the hashMap as an ArrayList
        return new ArrayList<>(hashMap.values());
    }
}