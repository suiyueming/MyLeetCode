package com.suiyue;

public class BullsandCows {

	
	public static String getHint(String secret, String guess) {
		if (secret.length() == 0) return "";
		int[] indexS = {0,0,0,0,0,0,0,0,0,0};
		int[] indexG = {0,0,0,0,0,0,0,0,0,0};
		int a = 0;
		int b = 0;
		for (int i=0; i<secret.length(); i++) {
			if(secret.charAt(i) == guess.charAt(i)) {
				a++;
			} else {
				indexS[(int)secret.charAt(i)-48] = indexS[(int)secret.charAt(i)-48] + 1;
				indexG[(int)guess.charAt(i)-48] = indexG[(int)guess.charAt(i)-48] + 1;
			}
		}
		for (int i=0; i<indexS.length; i++) {
			b += Math.min(indexS[i], indexG[i]);
		}
		return a + "A" + b + "B";
        
    }
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result = " + getHint("1807", "7810"));
	}

}
