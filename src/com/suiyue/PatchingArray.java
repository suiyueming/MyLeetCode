package com.suiyue;

public class PatchingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	 * tmp是可能错过的最小值，也就是目前可以完成[0,tmp)的构建
	 * 如果数组中存在一个数字num<=tmp，我们就可以完成[0，tmp+num)的构建
	 * 如果不存在这样一个数字，我们就需要插入一个这样的数字
	 */
	public int minPatches(int[] nums, int n) {
		long tmp = 1;
		int result = 0;
		int i = 0;
		while(tmp<n) {
			if(i<nums.length && nums[i] <= tmp) {
				tmp += nums[i++];
			} else {
				tmp += tmp;
				result ++;
			}
		}
		return result;
        
    }

}
