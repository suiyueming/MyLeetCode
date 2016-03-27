package com.suiyue.sort;

/**
 * Created by suiyue on 2016/3/27 0027.
 */
public class BubbleSort {
    private static int[] nums = {3, 38, 5, 44, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
    public static void main(String[] args) {
        new BubbleSort().bubbleSort();
        for(int i=0; i<nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
    }
    /*
    冒泡排序
    主要思想：在要排序的一组数中，对当前还未排好序的范围内的全部数，
    自上而下对相邻的两个数依次进行比较和调整，
    让较大的数往下沉，较小的往上冒。
    即：每当两相邻的数比较后发现它们的排序与排序要求相反时，就将它们互换。
     */
    public void bubbleSort() {
        int leftIndex = nums.length - 1;
        int rightIndex = 0;
        while(rightIndex <= leftIndex) {
            for(int i=0; i<leftIndex; i++) {
                if(nums[i] > nums[i+1]) {
                    swap(i, i+1);
                }
            }
            leftIndex --;
        }
    }
    public void swap(int firstIndex, int secondIndex) {
        int tmp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = tmp;
    }
}
