package com.suiyue;

import java.util.HashMap;

public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum(int[] nums, int target) {
		int result[] = {0,0};
		for(int i=0; i<nums.length; i++) {
			for (int j = i+1; j<nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i+1;
					result[1] = j+1;
					return result;
				}
			}
		}
		return result;
    }
	public int[] twoSum1(int[] nums, int target) {
		int result[] = {0,0};
		HashMap<Integer, Integer> tmp = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; i++) {
			if(null != tmp.get(target-nums[i]) && tmp.get(target-nums[i]) != i+1) {
				result[0] = tmp.get(target-nums[i]);
				result[1] = i+1;
				return result;
			};
			tmp.put(nums[i], i+1);			
		}
		return result;
    }

}
