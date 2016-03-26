package com.suiyue;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letterCombinations("234445");
	}
	public static List<String> letterCombinations(String digits) {
       List<String> result = new ArrayList<String>();
       String[][] letter = {{"a", "b", "c"},{"d", "e", "f"}, 
    		   {"g", "h", "i"}, {"j", "k", "l"}, {"m", "n", "o"},
    		   {"p", "q", "r", "s"}, {"t", "u", "v"}, {"w", "x", "y", "z"}};
       if(digits.contains("0") || digits.contains("1") || digits.contains("*")
    	   || digits.contains("*")) {
    	   return result;
	   }
       result.add("");
       for(int i=0; i<digits.length(); i++) {
    	   int x = digits.charAt(i) - 50;
    	   while(result.get(0).length() == i) {
    		   String s = result.remove(0);
    		   for (int j=0; j<letter[x].length; j++) {
    			   result.add(s + letter[x][j]);
    		   }
    	   }
       }
       if(result.size() != 0 && result.get(0).length() == 0) {
    	   result.remove(0);
       }
       return result;
    }

}
