class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;


        for (int i = 0; i < prices.length; i++){
            for (int j = prices.length - 1; j > i; j--){
                if (prices[j] - prices[i] > maxProfit){
                    maxProfit = prices[j] - prices[i];
                }

            }
        }


        return maxProfit;
        
    }
}
