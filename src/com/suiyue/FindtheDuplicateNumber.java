package com.suiyue;

import java.util.Arrays;

public class FindtheDuplicateNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i] == nums[i+1]) {
				return nums[i];
			}
		}
		return 0;
        
    }
	
	public int findDuplicate2(int[] nums) {
		if (nums.length > 1) {
	        int slow = nums[0];
	        int fast = nums[nums[0]];
	        while (slow != fast){
	            slow = nums[slow];
	            fast = nums[nums[fast]];
	        }

	        fast = 0;
	        while (fast != slow) {
	            fast = nums[fast];
	            slow = nums[slow];
	        }
	        return slow;
	    }
	    return -1;
        
    }

}
