class Solution {
    public String addStrings(String num1, String num2) 
    {
        //To solve this problem we must first find the length of each string and which length is greater
        int num1Length = num1.length() - 1;
        int num2Length = num2.length() - 1;
        int maxLength = Math.max(num1Length, num2Length) + 2;
        //After finding the length of each string we will create a character array to store the digit of both strings
        char[] ans = new char[maxLength];
        //We instnatiate the variable sum to add the digits from both num1 and num2 into the character array
        int sum = 0;
        //Iterate through num1 and num2 to add the digits into the character array
        while (num1Length >= 0 || num2Length >= 0)
        {
            if (num1Length >= 0)
            {
                //charAt(i) - '0' gives the integer value at index i
                sum += num1.charAt(num1Length--) - '0';
            }
            if (num2Length >=0)
            {
                sum += num2.charAt(num2Length--) - '0';
            }
            //We will be adding into the character array from right to left
            ans[--maxLength] = (char)((sum % 10) + '0');
            sum /= 10;
        }
        //If we have any carry over, we set ans[0] to 1 and return the string value of ans
        if (sum != 0)
        {
            ans[0] = '1';
            return String.valueOf(ans);
        }
        //Other wise, we return the string value from 1 to the length of the character array
        return String.valueOf(ans, 1, ans.length - 1);
    }
}