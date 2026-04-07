class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length - 1;

        int prof = 0;

        
        for (int i = n; i > 0; i--){
            int left = 0;
            int right = i;
            
            while (right <= n ){
                prof = Math.max(prof, prices[right] - prices[left]);
                left++;
                right++;
            }            
        }
     
        return prof;

        
    }
}
