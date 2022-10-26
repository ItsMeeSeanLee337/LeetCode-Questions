class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        //Hashset implementation
        Set used = new HashSet();
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                //If the character we are looking at on the board is not equal to '.', we put that character into the hashset
                if (board[i][j] != '.')
                {
                    //If when we put that charcter into the hashset, 
                    //.add returns false it means that the value is already in the hashset, thus meaning that the sudoku is not valid
                    if (!used.add(board[i][j] + " in row " + i) ||
                        !used.add(board[i][j] + " in column " + j) ||
                        !used.add(board[i][j] + " in box " + i/3 + "-" + j/3)
                       )
                    {
                        return false;
                    }
                }
            }
        }
        //If we can add all characters into the hashset without triggering a return value of false on .add, we have validated the sudoku board
        return true;
    }
}