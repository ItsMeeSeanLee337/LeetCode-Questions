class Solution {
    public void rotate(int[][] matrix) 
    {
        //Create a copy of the original matrix
        int[][] copy = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
        {
            copy[i] = matrix[i].clone();
        }
        //Explanation:
        /* 0,0 > 0,3 | 0,1 > 1,3 | 0,2 > 2,3 | 0,3 > 3,3
           1,0 > 0,2 | 1,1 > 1,2 | 1,2 > 2,2 | 1,3 > 3,2
           2,0 > 0,1 | 2,1 > 1,1 | 2,2 > 2,1 | 2,3 > 3,1
           3,0 > 0,0 | 3,1 > 1,0 | 3,2 > 2,0 | 3,3 > 3,0
        */
        //Create the variable column number to keep track of which column we need to insert into
        int columnNumber = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                matrix[j][columnNumber] = copy[i][j];
            }
            columnNumber--;
        }
    }
}