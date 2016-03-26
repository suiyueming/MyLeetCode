package com.suiyue;

public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
		int index = 0;		
        for (int i = 0; i < nums.length; i++ ) {
        	int tmp = nums[i];
        	nums[i] = 0;
        	if(tmp != 0) {
        		nums[index] = tmp;
        		index += 1;        		
        	}
        }
    }
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
}
