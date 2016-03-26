package com.suiyue;

public class IncreasingTripletSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1,2,1,2,1,2,1,2};
		System.out.println("result = " + increasingTriplet(nums));
	}
	
	public static boolean increasingTriplet(int[] nums) {
		if(nums.length < 3) return false;
		int [] result = new int[3];
		result[0] = nums[0];
		result[1] = Integer.MIN_VALUE;
		result[2] = Integer.MIN_VALUE;
		for (int i=1; i<nums.length; i++) {
			if(result[1] == Integer.MIN_VALUE) {
				if(nums[i] > result[0]) {
					result[1] = nums[i];
				} else {
					result[0] = nums[i];
				}
			} else if(result[2] == Integer.MIN_VALUE){
				if(nums[i] > result[1]) {
					return true;
				} else {
					result[2] = nums[i];
				}
			} else if (nums[i] > result[1]) {
				return true;
			} else if (nums[i] > result[2] && nums[i] < result[1]) {
				result[0] = result[2];
				result[1] = nums[i];
				result[2] = Integer.MIN_VALUE;
			} else if(nums[i] < result[0]) {
				result[2] = nums[i];
			} else if (nums[i] < result[1] && nums[i] > result[0]) {
				result[1] = nums[i];
			}
			System.out.println("i = " + i + " result[0] = " + result[0] + " result[1] = " + result[1] + " result[2] = " + result[2]);
		}
		
		return false;
    }
	
}
