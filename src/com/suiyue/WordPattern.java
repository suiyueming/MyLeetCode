package com.suiyue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String str) {
		
		Map<Character, String> map = new HashMap<>();
        String[] sList = str.split(" ");
        if (pattern.length() != sList.length) return false;
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                map.put(pattern.charAt(i), sList[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(sList[i])) return false;
            }
        }
        return map.values().size()== new HashSet<>(map.values()).size(); 
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
