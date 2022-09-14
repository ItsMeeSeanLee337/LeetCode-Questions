class Solution {
    public int maxProfit(int[] prices) 
    {
        int lowestBuyPrice = Integer.MAX_VALUE;
        int mostProfit = 0;
        int profitSoldToday = 0;
        for (int i = 0; i < prices.length; i++)
        {
            if (prices[i] < lowestBuyPrice)
            {
                lowestBuyPrice = prices[i];
            }
            profitSoldToday = prices[i] - lowestBuyPrice;
            if (mostProfit < profitSoldToday)
            {
                mostProfit = profitSoldToday;
            }
        }
        return mostProfit;
    }
}