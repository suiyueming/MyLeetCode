package com.suiyue;

/**
 * Created by suiyue on 2016/3/27 0027.
 */

public class MultiplyStrings {

    public static void main(String[]args){
        System.out.println(new MultiplyStrings().multiply("511", "1000"));
    }

    //字符串实现乘法
    public String multiply(String num1, String num2) {
        char[] a = num1.toCharArray();
        char[] b = num2.toCharArray();
        int[] c = new int[a.length + b.length];
        String result = "";
        //逐个相乘
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                c[i + j] += (a[a.length-1-i] - '0') * (b[b.length-1-j] - '0');
            }
        }
        //进位
        for (int i=0; i<c.length-1; i ++) {
            c[i+1] += c[i]/10;
            c[i] = c[i]%10;
        }
        //将int数组转为字符串
        int j=c.length - 1;
        while(c[j] == 0) {
           if(j == 0) {
               return "0";
           }
            j--;
        }
        for (int i=j; i>=0; i--) {
            result += c[i];
        }
        return result;
    }

}
