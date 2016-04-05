package com.suiyue;

/**
 * Created by suiyue on 2016/4/5 0005.
 */
public class JumpGame {

    //贪心算法
    public boolean canJump(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return true;
        int current = nums[0];
        for(int i = 0; i<nums.length; i++) {
            if(current == 0) return false;
            current --;
            if(current < nums[i]) {
                current = nums[i];
            }
            if (current + i >= nums.length-1) return true;
        }
        return false;
    }

    public boolean canJump2(int[] nums) {
        int currentIndex = 0;
        for(int i=0; i<nums.length; i++) {
            if(currentIndex < i) return false;
            currentIndex = (i + nums[i]) > currentIndex? i+nums[i]:currentIndex;
        }
        return true;
    }
}
