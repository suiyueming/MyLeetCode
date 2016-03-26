package com.suiyue;

public class PowXN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public double myPow(double x, int n) {
		if(n == 0) return 1d;
		if(x == 0 && n > 0) {
			return 0d;
		} else if(x == 0 && n < 0){
			return Double.NaN;
		}
		if(n > 0) {
			for(int i=1; i<n; i++) {
				x *= x;
			}
		} else {
			for(int i=1; i<Math.abs(n); i++) {
				x *= x;
				x = 1/x;
			}
		}
		return x;
        
    }
	
	public double myPow2(double x, int n) {
		if(n==0) return 1;
	    if(n<0){
	        n = -n;
	        x = 1/x;
	    }
	    return n%2==0 ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        
    }

}
