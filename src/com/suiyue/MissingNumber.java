package com.suiyue;

public class MissingNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int missingNumber(int[] nums) {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i=0; i<nums.length; i++) {
			if(min > nums[i]) {
				min = nums[i]; 
			}
			if(max < nums[i]) {
				max = nums[i];
			}
			sum += nums[i];
		}
		if(min != 0) {
			return 0;
		} else if (sum < (max*(max+1)/2)) {
			return max*(max+1)/2 - sum;
		} else {
			return max+1;
		}
        
    }

}
