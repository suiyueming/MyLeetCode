package com.suiyue;

public class CoinChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] coins = {2};
        int amount = 3;
        System.out.println(new CoinChange().coinChange(coins, amount));
    }
	public int coinChange(int[] coins, int amount) {
		//d(i) = min{d(i-coins[j]) + 1}
        if (amount < 0) return -1;
        if (amount == 0) return 0;
        int[] min = new int[amount+1];
        min[0] = 0;
        for(int i=1; i<=amount; i++) {
            min[i] = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++) {
                if(coins[j] <= i && min[i-coins[j]] < min[i]) {
                    min[i] = min[i-coins[j]] + 1;
                }
            }
        }
		return min[amount]==Integer.MAX_VALUE?-1:min[amount];
    }

}
