package com.suiyue;

/**
 * Created by suiyue on 2016/3/26 0026.
 */
public class SqrtX {
    public static void main(String args[]) {
        System.out.println(mySqrt(3));
    }
    public static int mySqrt(int x) {
        //避免除数为0的情况
        if (x == 0) return 0;
        int low = 0;
        int high = Integer.MAX_VALUE;
        while(low <= high) {
            int middle = (low + high)/2;
            if(middle > x/middle) {
                high = middle - 1;
            } else {
                if(middle + 1 > x/(middle + 1)) {
                    return middle;
                }
                low = middle + 1;
            }
        }
        return -1;
    }
}
