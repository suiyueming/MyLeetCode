package com.suiyue;

/**
 * Created by suiyue on 2016/3/27 0027.
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        new NextPermutation().nextPermutation(nums);

    }
    /*
    STL源码中的方法：
    1、在当前序列中，从尾端往前寻找两个相邻元素，前一个记为*i，后一个记为*ii，并且满足*i < *ii。
    2、然后再从尾端寻找另一个元素*j，如果满足*i < *j，即将第i个元素与第j个元素对调，
    3、并将第ii个元素之后（包括ii）的所有元素颠倒排序，即求出下一个序列了。
     */
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;
        int i = nums.length - 1;
        int iIndex = 0;
        int iiIndex = 0;
        int jIndex = 0;
        // 1
        while(i > 0) {
            if (nums[i-1] < nums[i]) {
                iIndex = i - 1;
                iiIndex = i;
                break;
            }
            i--;
        }
        // 2
        i = nums.length - 1;
        while (i >= 0) {
            if(nums[iIndex] < nums[i]) {
                jIndex = i;
                break;
            }
            i --;
        }
        int tmp = nums[iIndex];
        nums[iIndex] = nums[jIndex];
        nums[jIndex] = tmp;
        // 3
        i = nums.length - 1;
        while (iiIndex < i) {
            tmp = nums[iiIndex];
            nums[iiIndex] = nums[i];
            nums[i] = tmp;
            i --;
            iiIndex ++;
        }
        for(int k=0; k<nums.length; k++) {
            System.out.print(" " + nums[k]);
        }
    }


}
