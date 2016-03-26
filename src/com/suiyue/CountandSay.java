package com.suiyue;

public class CountandSay {
	
	public static String countAndSay(int n) {
		String s = "1";
		for(int i=0; i<n-1; i++) {
			System.out.println("i = " + i);
			int count = 1;
			String ns = "";
			if (s.length() == 1) {
				ns = ns + "1" + s;
				s = ns;
				continue;
			}
			for (int j=0; j<s.length(); j++) {
				if(j == s.length()-1){
					if (s.charAt(j) != s.charAt(j - 1)) {
						ns = ns + "1" + s.charAt(s.length() - 1);
					} else {
						ns = ns + count + s.charAt(s.length() - 1);
					}
				} else{
					if(s.charAt(j) == s.charAt(j + 1)) {
						count ++;
					} else {
						ns = ns + String.valueOf(count) + s.charAt(j);
						count = 1;
					}
				}
			}
			System.out.println("s = " + s);
			s = ns;
		}	
		return s;       
    }
	
	
	public static String countAndSay2(int n) {
		String s = "1";	
		for (int m=0; m<n-1; m++) {
			String[] ns = s.split("3");
			for (int i=0; i<ns.length; i++) {
				String[] ts = ns[i].split("2");
				for (int j=0; j<ts.length; j++) {
					if (ts[i].equals("")) {
						 
					}
					s = s + ts.length + "1";
				}
			}
		}
		return s;      
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result = " + countAndSay2(20));
	}
}
