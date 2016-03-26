package com.suiyue;

public class FirstBadVersion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result = " + firstBadVersion(2126753390));
	}
	
	public static int firstBadVersion(int n) {
        int index = n;
		int tmp = 0;
		int i =  0;
		while (Math.abs(index - tmp) != 1) {
			System.out.println("index = " + index);
			System.out.println("tmp = " + tmp);
			long sum = (long)index + (long)tmp;
			if (isBadVersion((int)(sum/2))) {
				index = (int)(sum/2);
			} else {
				tmp = (int)(sum/2);
			}
			
		}
		return isBadVersion(tmp)?tmp:index;
    }

	private static boolean isBadVersion(int i) {
		if(i>= 1702766719) {
			return true;
		}
		return false;
	}

}
