package com.suiyue;

/**
 * Created by suiyue on 2016/3/26 0026.
 */
public class Searcha2DMatrix {

    public static void main(String args[]) {
        int target = 11;
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(new Searcha2DMatrix().searchMatrix(matrix, target));
    }

    /*
    首先考虑在第几行
    在考虑在第几列
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        //数组为空
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        //确定在第几行
        int low = 0;
        int high = matrix.length-1;
        int middle = 0;
        while(low <= high) {
            middle = (low + high)/2;
            if(matrix[middle][0] == target) {
                return true;
            }
            if(matrix[middle][0] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        //在middle行找到目标数字
        int targetRow = middle;
        //避免定位到错误行
        if(matrix[middle][0] > target) {
            if(middle == 0) {
                return false;
            } else {
                targetRow --;
            }
        }
        low = 0;
        high = matrix[middle].length-1;
        while (low <= high) {
            middle = (low + high)/2;
            if(matrix[targetRow][middle] == target) {
                return true;
            }
            if(matrix[targetRow][middle] > target) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return false;
    }
}
