package com.suiyue;

public class AddDigits {
	public static int addDigits(int num) {
        int result = num % 10;
        int i = num / 10;
        while(i != 0) {
        	int j = i % 10;
        	i = i/10;
        	System.out.println("i = " + i);
        	result = (result + j);
    		while (result >= 10) {
        		result  = result/10 + result%10;
        	}
        	
        	System.out.println("j = " + j);
        	System.out.println("result = " + result);
			
        }
        return result;
    }
	
	public static int addDigits2(int num) {
		int result = num % 9;
        if(result == 0 && num != 0) {
        	result = 9;
        }
        return result;
    }
	
	public static void main(String[] args) {
		String a = "abc";
		String b = "abc";
		System.out.println(a == b);
		System.out.println("result = " + addDigits2(999));
	}
}
