package com.suiyue;

public class BestTimetoBuyandSellStock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maxProfit(int[] prices) {
		if(prices.length == 0) return 0;
		int result = 0;
		int tmp = prices[0];
		for (int i=1; i<prices.length; i++) {
			if(prices[i] - tmp > result) {
				result = prices[i] - tmp;
			}
			if(tmp > prices[i]) {
				tmp = prices[i];
			}
		}
		return result;
        
    }
	
	public int maxProfit2(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
        }
        return maxPro;
    }

}
