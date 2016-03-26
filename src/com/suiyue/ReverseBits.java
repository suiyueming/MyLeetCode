package com.suiyue;

public class ReverseBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int reverseBits(int n) {
		int result = 0;
	    for (int i = 0; i < 32; i++) {
	        result += n & 1;
	        n >>>= 1;   // CATCH: must do unsigned shift
	        if (i < 31) // CATCH: for last digit, don't shift!
	            result <<= 1;
	    }
	    return result;
        
    }

}
