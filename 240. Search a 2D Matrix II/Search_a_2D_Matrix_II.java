class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        //Intialize the variables i and j to denote which element of the matrix we are inspecting
        int i = 0;
        int j = matrix[0].length - 1;
        //To search the 2D Matrix we will begin from the top-right corner
        
        while (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length)
        {
            //If the element we are inspecting is equal to the target, return true
            if (matrix[i][j] == target)
            {
                return true;
            }
            //If the element we are inspecting is greater than the target, we will move left in the matrix i.e. j--
            else if (matrix[i][j] > target)
            {
                j--;
            }
            //If the element we are inspecting is less than the target, we will move down in the matrix i.e. i++
            else if (matrix[i][j] < target)
            {
                i++;
            }
        }
        //If we have reached the end of the while loop, that means the target value is not in the matrix and we will return false accordingly
        return false;
    }
}