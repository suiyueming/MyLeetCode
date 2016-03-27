package com.suiyue;

import java.util.Arrays;

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
    解释：
    一个序列的下一个排列一定与此序列有尽可能多的相同的前缀，也就是说，如果一个序列后面若干个数字数字有下一个排列，
    那么这若干个数字的下一个排列加上前缀就是此序列的下一个排列
    又如果一个序列是递减的，那么它不具备下一个排列，因此第一步找到所需的“序列后面若干个数字”
    第i个数字后面的元素是递减的，那么从后往前寻找，找到第一个大于nums[i]于之交换，
    由于前面的数字变大了，后面的数字自然需要变成升序
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
