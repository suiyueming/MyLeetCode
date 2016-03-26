package com.suiyue;

import java.util.HashMap;

public class SingleNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int singleNumber(int[] nums) {
		HashMap<Integer, Integer> tmp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(tmp.containsKey(nums[i])) {
				tmp.remove(nums[i]);
			} else {
				tmp.put(nums[i], nums[i]);
			}
		}
		for(int result : tmp.keySet()) {
			return result;
		}
		return 0;
        
    }
	
	public int singleNumber2(int[] nums) {
        int result = 0;
        for (int i = 0; i<nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
	public int[] singleNumber3(int[] nums) {
		HashMap<Integer, Integer> tmp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(tmp.containsKey(nums[i])) {
				tmp.remove(nums[i]);
			} else {
				tmp.put(nums[i], nums[i]);
			}
		}
		int[] result = new int[tmp.keySet().size()];
		int j = 0;
		for(int i : tmp.keySet()) {
			result[j] = i;
			j++;
		}
		return result;
    }
	
	public int singleNumber4(int[] nums) {
		HashMap<Integer, Integer> tmp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(tmp.containsKey(nums[i])) {
				if(tmp.get(nums[i]) == 1) {
					tmp.put(nums[i], 2);
				} else {
					tmp.remove(nums[i]);
				}
				
			} else {
				tmp.put(nums[i], 1);
			}
		}
		for(int result : tmp.keySet()) {
			return result;
		}
		return 0;
    }

}
