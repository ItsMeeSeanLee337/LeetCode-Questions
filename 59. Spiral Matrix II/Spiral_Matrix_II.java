class Solution {
    public int[][] generateMatrix(int n) 
    {
        //First create a size n x n matrix
        int[][] ans = new int[n][n];
        //Edge case: when n = 0 return matrix as is
        if (n == 0)
        {
            return ans;
        }
        //Create variables to denote which space in the matrix we are looking at
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        //The variable count will act as the iterator for us to insert into the answer matrix
        int count = 1;
        //The while loop ensures we do not cause an IndexOutOfBounds error
        while (rowStart <= rowEnd && colStart <= colEnd)
        {
            //First fill in the top row
            for (int i = colStart; i <= colEnd; i++)
            {
                ans[rowStart][i] = count++;
            }
            rowStart++;
            //We will then fill in the right-most column
            for (int i = rowStart; i <= rowEnd; i++)
            {
                ans[i][colEnd] = count++;
            }
            colEnd--;
            //Then we must fill the bottom-most column
            for (int i = colEnd; i >= colStart; i--)
            {
                if (rowStart <= rowEnd)
                {
                    ans[rowEnd][i] = count++;
                }
            }
            rowEnd--;
            //Finally we fill out the left-most column
            for (int i = rowEnd; i >= rowStart; i--)
            {
                if (colStart <= colEnd)
                {
                    ans[i][colStart] = count++;
                }
            }
            colStart++;
            //This loop of filling out the matrix in a circular motion will continue until there are no more spaces in the matrix to fill
        }
        return ans;
    }
}