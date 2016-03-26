package com.suiyue;

import java.util.Arrays;

public class MaximumProductofWordLengths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProduct(String[] words) {
		int result = 0;
		if (words.length<2) return result;
        for(int i=0; i<words.length; i++) {
        	for(int j=i+1; j<words.length; j++) {
        		if(! hasComm(words[i], words[j])) {
        			result = Math.max(result, words[i].length()*words[j].length());
        		}
        	}
        }
        return result;
    }
	public boolean hasComm(String a, String b) {
		int[] tmp = new int[26];
		for(int i=0; i<a.length(); i++) {
			tmp[a.charAt(i) - 97] = 1; 
		}
		for(int i = 0; i<b.length(); i++) {
			if(tmp[b.charAt(i) - 97] == 1) {
				return true;
			}
		}
		return false;
	}

}
