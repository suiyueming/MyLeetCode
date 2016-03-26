package com.suiyue;

public class ExcelSheetColumnNumber {

	/**
	 * @param args
	 */
	public static int titleToNumber(String s) {
        byte[] a = s.toUpperCase().getBytes();
        int result = 0;
        for (int i = a.length - 1; i >= 0; i--) {
        	result += (a[i]-64)*(Math.pow(26, a.length - i - 1));
        	System.out.println(a.length - i);
        	System.out.println(result);
        }
		return result;
    }
	
	public static int titleToNumberBetter(String s) {
	     int number=0;
	     for(int i=0;i<s.length();i++)
	     {
	        number=26*number+(s.charAt(i)-'A')+1; 
	     }
	     return number;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(titleToNumber("AB"));
	}

}
