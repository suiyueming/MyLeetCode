package com.suiyue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,0,-1,0,-2,2};
		fourSum(nums, 0);
	}
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int mid, right;
        int[] lastNums = new int[4];
        lastNums[0] = Integer.MAX_VALUE;
        lastNums[1] = Integer.MAX_VALUE;
        lastNums[2] = Integer.MIN_VALUE;
        lastNums[3] = Integer.MIN_VALUE;
        for(int start=0; start<nums.length - 3; start++) {
            for(int left=start+1; left<nums.length - 2; left++) {
                mid = left + 1;
                right = nums.length - 1;
                while (mid < right) {
                    int sum = nums[start] + nums[left] + nums[mid] + nums[right];
                    System.out.println("start = " + start + " left = " + left );
                    System.out.println("mid = " + mid + " right = " + right );
                    System.out.println("sum = " + sum);
                    if(sum == target) {
                        result.add(Arrays.asList(nums[start], nums[left], nums[mid], nums[right]));
                        lastNums[0] = nums[start];
                        lastNums[1] = nums[left];
                        lastNums[2] = nums[mid];
                        lastNums[3] = nums[right];
                        while(lastNums[2] == nums[mid]) {
                            mid ++;
                        }
                    } else if(sum > target) {
                        right --;
                    } else{
                        mid ++;
                    }
                }
            }
            
        }
        return result;
        
    }
	
	public List<List<Integer>> fourSum2(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(nums.length<4)return ans;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++){
            if(i>0&&nums[i]==nums[i-1])continue;
            for(int j=i+1; j<nums.length-2; j++){
                if(j>i+1&&nums[j]==nums[j-1])continue;
                int low=j+1, high=nums.length-1;
                while(low<high){
                    int sum=nums[i]+nums[j]+nums[low]+nums[high];
                    if(sum==target){
                        ans.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        while(low<high&&nums[low]==nums[low+1])low++;
                        while(low<high&&nums[high]==nums[high-1])high--;
                        low++;
                        high--;
                    }
                    else if(sum<target)low++;
                    else high--;
                }
            }
        }
        return ans;
    }

}
