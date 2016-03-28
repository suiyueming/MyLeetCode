package com.suiyue;

import java.util.ArrayList;

/**
 * Created by suiyue on 2016/3/28 0028.
 */
public class UglyNumberII {

    public static void main(String[] args) {
        System.out.println(new UglyNumberII().nthUglyNumber(10));
        System.out.println(new UglyNumberII().nthUglyNumber2(10));
    }

    //考虑递推方法
    public int nthUglyNumber2(int n) {
        if (n <= 0) return 0;
        int twoIndex = 0, threeIndex = 0, fiveIndex = 0;
        ArrayList<Integer> uglyNumberTable = new ArrayList<>();
        uglyNumberTable.add(1);
        while(uglyNumberTable.size()<n) {
            int next = Math.min(Math.min(uglyNumberTable.get(twoIndex)*2, uglyNumberTable.get(threeIndex) * 3), uglyNumberTable.get(fiveIndex)*5);
            uglyNumberTable.add(next);
            if(uglyNumberTable.get(twoIndex)*2==next) twoIndex ++;
            if(uglyNumberTable.get(threeIndex)*3==next) threeIndex ++;
            if(uglyNumberTable.get(fiveIndex)*5==next) fiveIndex ++;
        }
        return uglyNumberTable.get(n-1);
    }
    //依旧考虑最简单的方法
    //遍历
    public int nthUglyNumber(int n) {
        int i = 1;
        while (n > 0) {
            if(isUgly(i)) {
                n--;
            }
            i++;
        }
        return  i-1;
    }
    //判断一个数是否为整数
    public boolean isUgly(int num) {
        if ( num == 1) {
            return true;
        }
        if ( num == 0) {
            return false;
        }
        if(num%5 == 0){
            return isUgly(num/5);
        } else if (num%3 == 0) {
            return isUgly(num/3);
        } else if (num%2 == 0) {
            return isUgly(num/2);
        } else {
            return false;
        }
    }
}
