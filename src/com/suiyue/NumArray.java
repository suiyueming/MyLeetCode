package com.suiyue;

import java.util.ArrayList;

public class NumArray {

	private ArrayList<Integer> results = new ArrayList<Integer>();
    
    public NumArray(int[] nums) {
    	if(nums.length != 0) {
    		results.add(nums[0]);
            for (int i = 1; i<nums.length; i++) {
            	results.add(results.get(i-1) + nums[i]);
            }
    	}
        
    }

    public int sumRange(int i, int j) {
    	if(i >= 1) {
    		return results.get(j) - results.get(i-1);
    	} else {
    		return results.get(j);
    	}
		
    }

}
