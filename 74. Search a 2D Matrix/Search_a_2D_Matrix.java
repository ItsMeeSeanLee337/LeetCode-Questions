class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        //Binary search implementation
        int column = 0;
        int row = matrix[0].length - 1;
        while (column < matrix.length && row >= 0)
        {
            //If we find the target, return true
            if (matrix[column][row] == target)
            {
                return true;
            }
            //If the number we choose is greater than target, decrement the row
            else if (matrix[column][row] > target)
            {
                row--;
            }
            //If the number we choose is less than the target, increment the column
            else if (matrix[column][row] < target)
            {
                column++;
            }
        }
        //If we iterate through the while loop and do not return true, return fale
        return false;
    }
}