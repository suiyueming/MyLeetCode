package com.suiyue;

public class FindMinimumInRotatedSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//和正常的有什么区别？？
	public int findMin(int[] nums) {
		if(nums == null || nums.length == 0) return Integer.MIN_VALUE;
		int result = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(result > nums[i]) {
				result = nums[i];
			}
		}
		return result;
    }
	public int findMin2(int[] nums) {
		int start=0,end=nums.length-1;
        while (start<end) {
            if (nums[start]<nums[end])
                return nums[start];
            int mid = (start+end)/2;
            if (nums[mid]>=nums[start]) {
                start = mid+1;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

}
