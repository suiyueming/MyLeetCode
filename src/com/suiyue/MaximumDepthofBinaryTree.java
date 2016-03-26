package com.suiyue;

public class MaximumDepthofBinaryTree {

	
	public int maxDepth(TreeNode root) {
       if(root == null){
    	   return 0;
       } else {
    	   return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
       }
    }
	
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
}
