package com.suiyue;

public class SortColors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void sortColors(int[] nums) {
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == 0) {
        		redCount ++;
        	} else if(nums[i] == 1) {
        		whiteCount ++;
        	} else {
        		blueCount ++;
        	}
        }
        for(int i =0; i<redCount; i++) {
        	nums[i] = 0;
        }
        for(int i =0; i<whiteCount; i++) {
        	nums[redCount + i] = 1;
        }
        for(int i =0; i<blueCount; i++) {
        	nums[redCount + whiteCount + i] = 2;
        }
    }
	
	public void sortColors2(int[] nums) {
        int blueIndex = nums.length - 1;
        int redIndex = 0;
        for(int i=0; i<=blueIndex; i++) {
        	while(nums[i] == 2 && i < blueIndex) {
        		int tmp = nums[i];
        		nums[i] = nums[blueIndex];
        		nums[blueIndex] = tmp;
        		blueIndex --;
        	}
        	while(nums[i] == 0 && i > redIndex) {
        		int tmp = nums[i];
        		nums[i] = nums[redIndex];
        		nums[redIndex] = tmp;
        		redIndex ++;
        	}
        }
    }
	
	public void sortColors3(int[] nums) {
		int i=-1, j=-1, k=-1;
		for(int p = 0; p < nums.length; p++){
	        if(nums[p] == 0){
	            nums[++k]=2;
	            nums[++j]=1;
	            nums[++i]=0;
	        }
	        else if (nums[p] == 1)
	        {
	            nums[++k]=2;
	            nums[++j]=1;

	        }
	        else if (nums[p] == 2)
	        {
	            nums[++k]=2;
	        }
	    }
    }

}
