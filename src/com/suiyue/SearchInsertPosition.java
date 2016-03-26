package com.suiyue;

public class SearchInsertPosition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,6};
		System.out.println("result = " + searchInsert(nums, 6));
	}
	
	public static int searchInsert(int[] nums, int target) {
		if(nums == null || nums.length == 0) return 0;
		int minIndex = 0;
		int maxIndex = nums.length - 1;
		int midIndex = 0;
		//数组越界
		while(minIndex <= maxIndex) {
			midIndex = (maxIndex + minIndex)/2;
			if(nums[midIndex] == target) {
				return midIndex;
			} else if(nums[midIndex] > target) {
				maxIndex = midIndex - 1;
			} else {
				minIndex = midIndex + 1;
			}
		}
		if (nums[midIndex] > target) {
			return midIndex;
		} else {
			return midIndex + 1;
		}
        
    }
	

}
