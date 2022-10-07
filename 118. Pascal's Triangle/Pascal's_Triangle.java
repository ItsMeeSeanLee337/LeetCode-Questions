class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> returnList = new ArrayList<>();
        if (numRows == 0)
        {
            return returnList;
        }
        //Add the first row
        returnList.add(new ArrayList<>(Arrays.asList(1)));
        //Add all additional rows
        for (int i = 1; i < numRows; i++)
        {
            List<Integer> row  = new ArrayList<>();
            //Add 1 to the left of the row
            row.add(1);
            //Calculate what else needs to be in the row
            for (int j = 1; j < i; j++)
            {
                int leftNum = returnList.get(i - 1). get(j - 1);
                int rightNum = returnList.get(i - 1).get(j);
                row.add(leftNum + rightNum);
            }
            //Add 1 to the right of the row
            row.add(1);
            returnList.add(row);
        }
        return returnList;
    }
}