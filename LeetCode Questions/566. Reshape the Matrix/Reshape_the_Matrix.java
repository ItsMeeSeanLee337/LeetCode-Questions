class Solution 
{
    public int[][] matrixReshape(int[][] mat, int r, int c) 
    {
        //First check to see if reshape is legal
        int newMatrixSize = r * c;
        int rowsOfOriginal = mat.length;
        int columnsOfOriginal = mat[0].length;
        int numberOfIntegers = rowsOfOriginal * columnsOfOriginal;
        if (newMatrixSize != numberOfIntegers)
        {
            return mat;
        }
        //If legal, reshape the matrix
        int[][] newMatrix = new int[r][c];
        //Go through the original matrix, putting all the elements into a 1 dimensional array
        int[] oneDimensional = new int[numberOfIntegers];
        int element = 0;
        for (int i = 0; i < rowsOfOriginal; i++)
        {
            for (int j = 0; j < columnsOfOriginal; j++)
            {
                oneDimensional[element] = mat[i][j];
                element++;
            }
        }
        element = 0;
        //Now put elements into the new matrix
        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                newMatrix[i][j] = oneDimensional[element];
                element++;
            }
        }
        return newMatrix;
    }
}