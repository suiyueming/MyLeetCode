package com.suiyue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,-1,14,-12,-8,7,2,-15,8,8,-8,-14,-4,-5,7,9,11,-4,
				-15,-6,1,-14,4,3,10,-5,2,1,6,11,2,-2,-5,-7,-6,2,-15,11,
				-6,8,-4,2,1,-1,4,-6,-15,1,5,-15,10,14,9,-8,-6,4,-6,11,12,
				-15,7,-1,-9,9,-1,0,-4,-1,-12,-2,14,-9,7,0,-3,-4,1,
				-2,12,14,-10,0,5,14,-1,14,3,8,10,-8,8,-5,-2,6,-11,12,13,
				-7,-12,8,6,-13,14,-2,-5,-11,1,3,-6};
		threeSum(nums);
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		HashMap<Integer, Integer> tmp = new HashMap<>();
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != 0) {
				if(tmp.containsKey(nums[i])) {
					tmp.put(nums[i], 2);
				} else {
					tmp.put(nums[i], 1);
				}
			} else if(tmp.containsKey(0)){
				tmp.put(0, tmp.get(0) + 1);
			} else {
				tmp.put(0, 1);
			}
		}
		for(int i =0; i<nums.length && nums[i] < 0; i++) {
		    if(i>0 && nums[i] == nums[i-1]) {
		        continue;
		    } else {
		    	int lastNum = Integer.MAX_VALUE;
    			for(int j=i+1; j<nums.length; j++) {
    				int needInt = 0 - nums[i] - nums[j];
    				if(nums[j] == lastNum) {
    			        continue;
    			    }
    				lastNum = nums[j];
    				if(tmp.containsKey(needInt) && needInt > nums[j]) {
    				    System.out.println("needInt = " + needInt);
    					List<Integer> oneResult = new ArrayList<>();
    					oneResult.add(nums[i]);
    					oneResult.add(nums[j]);
    					oneResult.add(needInt);
    					result.add(oneResult);
    				} else if(tmp.containsKey(needInt) && needInt == nums[j] && tmp.get(needInt) == 2) {
    					List<Integer> oneResult = new ArrayList<>();
    					oneResult.add(nums[i]);
    					oneResult.add(nums[j]);
    					oneResult.add(needInt);
    					result.add(oneResult);
    				} else if(tmp.containsKey(needInt) && needInt < nums[j]) {
    					break;
    				}
    			}
    		}
		}
		if(tmp.containsKey(0) && tmp.get(0) >= 3) {
			List<Integer> oneResult = new ArrayList<>();
			oneResult.add(0);
			oneResult.add(0);
			oneResult.add(0);
			result.add(oneResult);
		}
		return result;
    }
	
	public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 >= 0 && nums[i] == nums[i - 1]) continue;// Skip equnumsl elements to avoid duplicates
    
            int left = i + 1, right = nums.length - 1; 
            while (left < right) {// Two Pointers
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) { 
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left + 1 < right && nums[left] == nums[left+1])// Skip equal elements to avoid duplicates
                        left++;
                    while (right -1 > left && nums[right] == nums[right-1])// Skip equal elements to avoid duplicates
                        right--;
                    left++; 
                    right--;
                } else if (sum < 0) { 
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}
