package com.suiyue;

public class BalancedBinaryTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		int val = 0;
		 TreeNode left = null;
		 TreeNode right = null;
		 TreeNode(int x) { val = x; }
	}
	
	public boolean isBalanced(TreeNode root) {
		if(root == null) return true; 
		if(Math.abs(height(root.left) - height(root.right)) > 1) {	
			return false;
		}
		return isBalanced(root.left) && isBalanced(root.right);
        
    }
	
	public int height(TreeNode t) {
		if (t == null) {
			return -1;
		} else {
			return 1 + Math.max(height(t.left), height(t.right));
		}
	}

}
