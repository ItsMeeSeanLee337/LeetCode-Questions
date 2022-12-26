class Solution {
    public int subtractProductAndSum(int n) 
    {
        //Product is set to 1 so that we can multiply the digits by 1
        int product = 1;
        //Sum is set to 0 so we can incrementally add to the sum
        int sum = 0;
        //While there are still digits to process, we increment
        while (n > 0)
        {
            //Add the last digit to sum
            sum += n % 10;
            //Multiply the last digit by sum
            product *= n % 10;
            //Remove the last digit from productTemp
            n /= 10;
        }
        return (product - sum);
    }
}