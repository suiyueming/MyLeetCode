package com.suiyue;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		String s = "";
		if (strs.length == 0) return s;
		if (strs.length == 1) return strs[0];
		for(int i=0; i<Math.min(strs[0].length(), strs[1].length()); i++) {
			if(strs[0].charAt(i) == strs[1].charAt(i)) {
				s += strs[1].charAt(i);
			} else {
				break;
			}
		}
		
		for (int i = strs.length - 1; i>1; i--) {
			if(s.equals("") || strs[i].length()==0) return "";
			s = s.substring(0, Math.min(s.length(), strs[i].length()));
			for (int j=0; j<s.length(); j++) {				
				System.out.println("j = " + j);
				if(s.charAt(j) != strs[i].charAt(j)) {
					if(j == 0) {
						return "";
					}
					s = s.substring(0, j);
					break;
				}
			}
		}		
		return s;       
    }
	
	public static String longestCommonPrefix2(String[] strs) {
		String s = "";
		if (strs.length == 0) return s;
		if (strs.length == 1) return strs[0];
		s = strs[0];
		for (int i=1; i<strs.length; i++) {
			if(s.equals("") || strs[i].length()==0) return "";
			s = s.substring(0, Math.min(s.length(), strs[i].length()));
			for (int j=0; j<s.length(); j++) {				
				if(s.charAt(j) != strs[i].charAt(j)) {
					if(j == 0) {
						return "";
					}
					s = s.substring(0, j);
					break;
				}
			}
		}		
		return s;       
    }
	
	public static void main(String[] args) {
		String[] s = {"abab","aba","abc"};
		System.out.println("result = " + longestCommonPrefix(s));
	}
	
}
