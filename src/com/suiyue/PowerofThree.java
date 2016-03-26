package com.suiyue;

public class PowerofThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPowerOfThree(int n) {
		if(n<1) return false;
		while (n != 1) {
			if(n%3!=0) {
				return false;
			} else {
				n = n/3;
			}
		}
		return true;
        
    }

}
