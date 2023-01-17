class Solution {
    public List<String> findRepeatedDnaSequences(String s) 
    {
        //We will create two HashSets to compare which 10 letter sequences are repeated
        Set seen = new HashSet();
        Set repeated = new HashSet();
        for (int i = 0; i + 9 < s.length(); i++)
        {
            //Extract the 10 letter subsequence at index to to index i + 10
            String sequence = s.substring(i, i + 10);
            //If that sequence is not in the seen HashSet, add it into the seen HashSet
            //If the sequence is already in the seen HashSet, add the sequence to the repeated HashSet
            if (!seen.add(sequence))
            {
                repeated.add(sequence);
            }
        }
        //Change the repeated HashSet into an ArrayList and return it
        return new ArrayList(repeated);
    }
}