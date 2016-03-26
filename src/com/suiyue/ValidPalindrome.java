package com.suiyue;

public class ValidPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result = " + isPalindrome("ab"));
	}
	
	
	public static boolean isPalindrome(String s) {
		String t = "";
		s.toLowerCase();
		for (int i=0; i<s.length(); i++) {
			if ((s.charAt(i)>47 && s.charAt(i)<57) ||
					(s.charAt(i)>96 && s.charAt(i)<123)) {
				t += s.charAt(i);
			}	
		}
		
		System.out.println(t);
		if (t.length() == 0) return true;
		for (int i=0; i<t.length()/2; i++) {
			if(t.charAt(i) != t.charAt(t.length() -1 -i)) {
				return false;
			}
		}		
		return true;    
    }
	
	public static boolean isStr(char c) {
		return false;
	}

}
