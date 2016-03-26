package com.suiyue;

/**
 * Created by suiyue on 2016/3/24 0024.
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int [] result = new int[2];
        int tmp = findTarget(nums, target);
        if (tmp == -1) {
            result[0] = -1;
            result[1] = -1;
        } else {
            int i = tmp;
            int j = tmp;
            while (i<nums.length && nums[i] == target) {
                i++;
            }
            result[1] = --i;
            while (j>-1 && nums[j] == target) {
                j--;
            }
            result[0] = ++j;
        }
        return result;
    }
    public int findTarget(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if(nums.length == 0) {
            return -1;
        }
        while (low <= high) {
            int middle = (low+high)/2;
            if(nums[middle] == target) {
                return middle;
            }
            if(nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
