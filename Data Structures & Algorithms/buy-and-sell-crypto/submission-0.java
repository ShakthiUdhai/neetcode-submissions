class Solution {
    public int maxProfit(int[] prices) {
        int i=0;
        int j=1;
        int maxProfit = 0;
        while(j<prices.length){
            if(prices[j]<prices[i]){
                i=j++;
            }
            else{
                maxProfit = Math.max(maxProfit,prices[j]-prices[i]);
                j++;
            }
        }
        return maxProfit;
    }
}
