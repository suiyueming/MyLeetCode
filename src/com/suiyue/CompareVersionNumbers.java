package com.suiyue;

public class CompareVersionNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result = " + compareVersion("1.0.1", "1"));
	}
	
	public static int compareVersion(String version1, String version2) {
		String[] vs1 = version1.split("\\.");
		String[] vs2 = version2.split("\\.");
		int i=0;
		while(i<Math.min(vs1.length, vs2.length)) {
			if(Integer.parseInt(vs1[i]) > Integer.parseInt(vs2[i])) {
				return 1;
			} else if (Integer.parseInt(vs1[i]) == Integer.parseInt(vs2[i])) {
				i++;
			} else {
				return -1;
			}
			
		};
		if(i < vs1.length) {
			for (int j = i; j<vs1.length; j++) {
				if(Integer.parseInt(vs1[j]) != 0) {
					return 1;
				}
			}
			
		} else if(i< vs2.length) {
			for (int j = i; j<vs2.length; j++) {
				if(Integer.parseInt(vs2[j]) != 0) {
					return -1;
				}
			}
		}
		return 0;
        
    }

}
