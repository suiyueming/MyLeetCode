package com.suiyue;

import java.util.HashMap;

public class RemoveDuplicatesfromSortedArrayII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int removeDuplicates(int[] nums) {
		int result = nums.length;
		HashMap<Integer, Integer> numsCount = new HashMap<>();
		int index = 0;
		for(int i = 0; i < nums.length; i++) {
			if(numsCount.containsKey(nums[i]) && numsCount.get(nums[i]) > 1) {
				result --;
			} else if(numsCount.containsKey(nums[i])) {
				numsCount.put(nums[i], 2);
				nums[index] = nums[i];
				index ++;
			} else {
				numsCount.put(nums[i], 1);
				nums[index] = nums[i];
				index ++;
			}
		}
		return result;
        
    }

}
