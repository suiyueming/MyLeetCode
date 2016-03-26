package com.suiyue;

/**
 * Created by suiyue on 2016/3/26 0026.
 */
public class SearchA2DMatrixII {
    /*横列和纵列均已排序
    首先考虑最常规的方法，逐行遍历
    复杂度O(nlog(m))
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0; i<matrix.length; i++) {
            int low = 0;
            int high = matrix[i].length-1;
            while (low <= high) {
                int middle = (low + high)/2;
                if(matrix[i][middle] == target) {
                    return true;
                }
                if(matrix[i][middle] > target) {
                    high = middle - 1;
                } else {
                    low = middle + 1;
                }
            }
        }
        return false;
    }
    /*
    改进算法
    根据行列递增的属性遍历
    复杂度O(m+n)
     */
    public boolean searchMatrix2(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int col = matrix[0].length - 1;
        int row = 0;
        while (col>=0 && row<matrix.length) {
            if(target == matrix[row][col]) {
                return true;
            } else if(target < matrix[row][col]) {
                col --;
            } else if (target > matrix[row][col]) {
                row ++;
            }
        }
        return false;
    }

}
