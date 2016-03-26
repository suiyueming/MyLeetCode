package com.suiyue;

import java.util.Arrays;

public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-3,-2,-5, 3, -4}; 
		System.out.println("result = " + threeSumClosest(nums, -1));
	}
	public static int threeSumClosest(int[] nums, int target) {
		if(nums.length == 3) return nums[0] + nums[1] + nums[2];
		Arrays.sort(nums);
		int nowIndex, minDifference = Integer.MAX_VALUE, rightIndex = 0, leftIndex = 0, closestNum = nums[0] + nums[1] + nums[2];
		int length = nums.length;
		for(int i=0; i<nums.length - 2; i++) {
			nowIndex = i;
			rightIndex = length - 1;
			leftIndex = i + 1;
			while(leftIndex < rightIndex) {				
				int difference = nums[nowIndex] + nums[rightIndex] + nums[leftIndex] - target;
				System.out.println("different = " + difference);
				if(difference == 0) {
					return target;
				} else if(Math.abs(difference) < minDifference) {
					closestNum = nums[nowIndex] + nums[rightIndex] + nums[leftIndex];
					minDifference = Math.abs(difference);
					if(difference < 0) {
						leftIndex ++;
					} else {
						rightIndex --;
					}
				} else if(difference < 0) {
					leftIndex ++;
				} else {
					rightIndex --;
				}
			}
			
		}
		return closestNum;
        
    }

}
