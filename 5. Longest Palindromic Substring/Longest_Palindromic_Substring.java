class Solution {
    public String longestPalindrome(String s) 
    {
        //If the length of s is 0, return nothing
        if (s.length() == 0)
        {
            return "";
        }
        //Double pointer array for the substring of palindromes
        boolean[][] doublePointer = new boolean[s.length()][s.length()];
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++)
        {
            for (int j = i; j >= 0; j--)
            {
                boolean startEqEnd = s.charAt(j) == s.charAt(i);
                if (i == j)
                {
                    //If s[i] and s[j] are the same characters: 'a' is a palindrome
                    doublePointer[i][j] = true; 
                }
                else if (i - j == 1)
                {
                    //If the length is 2: 'ab' is palindrome only when character 'a' is equal to character 'b'
                    doublePointer[i][j] = startEqEnd;
                }
                else if (startEqEnd && doublePointer[i - 1][j + 1])
                {
                    //Otherwise, the string is a palindrome if s[i] = s[j] and substring s[j + 1, i - 1] is a palindrome
                    doublePointer[i][j] = true;
                }
                if (doublePointer[i][j] && i - j > end - start)
                {
                    end = i;
                    start = j;
                }
            }
        }
        return s.substring(start, end + 1);
    }
}