class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 1){ // if prices[]={1} array has only one element
            return 0;
        }
        int  buyPrice = prices[0];
        int curprofit=0;
        int maxprofit =Integer.MIN_VALUE;
        for(int i=1; i<prices.length; i++){
            if(buyPrice < prices[i]){
                curprofit = prices[i] - buyPrice;
            }
            else{
                buyPrice = prices[i];
            }
            maxprofit = Math.max(maxprofit,curprofit);
        }
        
        return maxprofit;
        
    }
}