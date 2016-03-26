package com.suiyue;

import java.util.Arrays;

public class ValidAnagram {
	public static boolean isAnagram(String s, String t) {
		byte[] s_byte = s.getBytes();
		byte[] t_byte = t.getBytes();
		Arrays.sort(s_byte);
		Arrays.sort(t_byte);
		return (new String(s_byte)).equals(new String(t_byte));
    }
	
	public boolean isAnagramBetter(String s, String t) {

	    int[] charsMap = new int['z'-'a'+1];

	    for(char c: s.toCharArray()) {
	        int pos = c - 'a';
	        charsMap[pos]++;
	    }

	    for(char c: t.toCharArray()) {
	        int pos = c - 'a';
	        charsMap[pos]--;
	    }

	    for(int count: charsMap) {
	        if(count != 0) {
	            return false;
	        }
	    }

	    return true;
	}
	
	public static void main(String[] args) {
		String s = "";
		String t = "";
		System.out.println(isAnagram(s,t));
	}
}
