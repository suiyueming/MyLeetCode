package com.suiyue;

public class MaximumSubarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxSubArray(int[] nums) {
		int result = 0;
		if(nums == null || nums.length == 0) return result;
		int max = nums[0];
		result = max;
		for(int i=1; i<nums.length; i++) {
			if(max > 0) {
				max += nums[i];
			} else {
				max = nums[i];
			}
			if(result < max) {
				result = max;
			}
		}
		return result;
    }
	
	
	public static int maxSubArray2(int[] nums) {
	    int maxSoFar=nums[0], maxEndingHere=nums[0];
	    for (int i=1;i<nums.length;++i){
	        maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
	        maxSoFar=Math.max(maxSoFar, maxEndingHere); 
	    }
	    return maxSoFar;
	}

}
