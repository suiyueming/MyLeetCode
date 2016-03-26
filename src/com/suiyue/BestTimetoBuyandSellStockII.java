package com.suiyue;

import java.time.Period;

public class BestTimetoBuyandSellStockII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {
		int result = 0;
		for (int i=0; i<prices.length-1; i++) {
			if(prices[i+1] > prices[i]) {
				result += prices[i+1] - prices[i];
			}
		}
		return result;
        
    }

}
