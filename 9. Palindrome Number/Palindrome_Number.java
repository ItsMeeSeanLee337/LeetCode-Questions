class Solution {
    public boolean isPalindrome(int x) 
    {
        //Convert x from an integer to a string
        String xString = Integer.toString(x);
        //Create a comparison string variable
        String compare = "";
        //Iterate through each in digit in the integer from right to left
        for (int i = xString.length() - 1; i >= 0; i--)
        {
            //Add each digit from right to left into the comparison string
            compare+= xString.charAt(i);
        }
        //If the comparison string equals the converted integer, return true since x is a palindrome
        if (xString.equals(compare))
        {
            return true;
        }
        //Otherwise, return false
        else
        {
            return false;
        }
    }
}