package com.suiyue;

public class ProductofArrayExceptSelf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//不符合要求的一版
	public int[] productExceptSelf(int[] nums) {
		long allProduct = 1;
		int zeroCount = 0;
		int zeroLocal = 0;
		int[] result = new int[nums.length];
		for (int i=0; i<nums.length; i++) {
			if(nums[i] == 0 ) {
				zeroCount += 1;
				zeroLocal = i;
			} else {
				allProduct *= nums[i];
			}
		}
		if(zeroCount == 0) {
			for(int i=0; i<nums.length; i++) {
				result[i] = (int) (allProduct/nums[i]);
			}
		} else if(zeroCount == 1) {
			result[zeroLocal] = (int) allProduct;
		}
		
		return result;
        
    }
	
	public int[] productExceptSelf2(int[] nums) {
		int n = nums.length;
	    int[] res = new int[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;
        
    }
	

}
