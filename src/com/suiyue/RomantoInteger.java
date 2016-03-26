package com.suiyue;

public class RomantoInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int romanToInt(String s) {
		if(s.length() == 0) return 0;
		if(s.length() == 1) return toInt(s.charAt(0));
		int result = 0;
		for (int i = 1; i < s.length(); i++) {
			if(toInt(s.charAt(i)) > toInt(s.charAt(i-1))) {
				result -= toInt(s.charAt(i-1));
			} else {
				result += toInt(s.charAt(i-1));
			}
		}
		result += toInt(s.charAt(s.length() - 1));
		return result;
        
    }
	
	public int toInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			break;
		}
		return 0;
	}

}
