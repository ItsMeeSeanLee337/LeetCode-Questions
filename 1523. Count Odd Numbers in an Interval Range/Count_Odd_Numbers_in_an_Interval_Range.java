class Solution {
    public int countOdds(int low, int high) 
    {
        //The number of odd numbers in the range from 1 to high is (high + 1) / 2
        //The number of odd numbers in the range from 1 to low is low / 2
        //Subtracting these two numbers gives the number of odd numbers between high and low
        return (((high + 1)/2) - (low/2));
    }
}