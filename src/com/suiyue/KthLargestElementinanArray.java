package com.suiyue;

import java.util.Arrays;

public class KthLargestElementinanArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findKthLargest(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
        
    }

}
