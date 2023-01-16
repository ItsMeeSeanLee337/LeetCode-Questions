class Solution {
    public String multiply(String num1, String num2) 
    {
        //To solve this problem we will act as if we are doing simple multiplication where we go from right to left multiplying every pair of digits and adding them together
        int[] pos = new int[num1.length() + num2.length()];
        //Iterate through all the digits in num1
        for (int i = num1.length() - 1; i >= 0; i--)
        {
            //Iterate through all the digits in num2
            for (int j = num2.length() - 1; j>= 0; j--)
            {
                //Multiply num1[i] * num2[j]
                //charAt(i) - '0' gives the integer value of that digit
                int multiply = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int position1 = i + j;
                int position2 = i + j + 1;
                int sum = multiply + pos[position2];
                pos[position1] += sum / 10;
                pos[position2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : pos)
        {
            if (!(sb.length() == 0 && p == 0))
            {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}