package com.suiyue;

import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> tmp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(tmp.containsKey(nums[i])) {
				int now = tmp.get(nums[i]);
				if(i - now <= k) {
					return true;
				} else {
					tmp.put(nums[i], i);
				}
			} else {
				tmp.put(nums[i], i);
			}
		}
		return false;
        
    }

}
