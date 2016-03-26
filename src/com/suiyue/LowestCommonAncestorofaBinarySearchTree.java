package com.suiyue;

public class LowestCommonAncestorofaBinarySearchTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode tmp = root;
		while (tmp.right != null || tmp.right != null) {
			if((tmp.val - q.val) * (tmp.val - p.val) < 0) {
				return tmp;
			} else if((tmp.val - q.val) * (tmp.val - p.val) == 0) {
				return tmp.val==q.val?q:p;
			} else if (tmp.val > q.val) {
				tmp = tmp.left;
			} else {
				tmp = tmp.right;
			}
		}
		return tmp;
		
    	
    }
	        


}
