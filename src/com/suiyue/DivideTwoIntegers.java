package com.suiyue;

public class DivideTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int divide(int dividend, int divisor) {
		
		if(dividend == 0) return 0;
		if(divisor == 0) return Integer.MAX_VALUE;
		if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
		
		return dividend/divisor;
        
    }

}
