package com.suiyue;

/**
 * Created by suiyue on 2016/3/26 0026.
 */
public class MinimumSizeSubarraySum {

    public static void main(String args[]) {
        int s = 120331635;
        int[] nums = {};
        System.out.println(minSubArrayLen(s, nums));
    }

    /*
     *首先考虑最简单的方法
     * 遍历寻找做小子串的长度
     * 外层循环负责找到子串的第一个数字
     * 里层循环负责找到子串的最后一个数字
     * leetcode提交超时
     * 复杂度为O(n^2)
     */
    public static int minSubArrayLen(int s, int[] nums) {
        int result = nums.length + 1;
        for (int i=0; i<nums.length; i++) {
            int len = 0;
            int sum = 0;
            for(int j=i; j<nums.length; j++) {
                sum += nums[i];
                len ++;
                if(sum >= s) {
                    if(result > len) result = len;
                    break;
                }
            }
        }
        return result==nums.length+1?0:result;
    }

    /*
     * 遍历一遍
     * 1、首先找到有效的子串
     * 2、向右移动这个子串？？
     *
     */
    public static int minSubArrayLen2(int s, int[] nums) {
        int result = nums.length+1;
        int len = 0;
        int sum = 0;
        int nowIndex = 0;
        for (int i=0; i<nums.length; i++) {
            len ++;
            sum += nums[i];
            while(sum >= s) {
                if(sum - nums[nowIndex] >= s) {
                    sum -= nums[nowIndex];
                    nowIndex ++;
                    len --;
                } else {
                    break;
                }
            }
            if(sum >= s  && result>len) {
                result = len;
            }
        }
        return result==nums.length+1?0:result;
    }
}
