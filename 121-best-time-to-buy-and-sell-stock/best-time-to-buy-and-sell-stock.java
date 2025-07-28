class Solution {
    public int maxProfit(int[] prices) {
        int mxp = 0;
        int minc = prices[0];
        for (int i=1; i < prices.length; i++) {
            mxp = Math.max(mxp, prices[i]-minc);
            minc = Math.min(prices[i], minc);
        }
        return mxp;
    }
}