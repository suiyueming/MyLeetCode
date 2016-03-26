package com.suiyue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import com.suiyue.BalancedBinaryTree.TreeNode;

public class BinaryTreePreorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		stack.push(root);
		while(! stack.isEmpty()) {
			TreeNode treeNode = stack.pop();
			result.add(treeNode.val);
			if(treeNode.right != null) {
				stack.push(treeNode.right);
			}
			if(treeNode.left != null) {
				stack.push(treeNode.left);
			}
		}
		return result;
        
    }
	
	public List<Integer> preorderTraversal2(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
	    Stack<TreeNode> rights = new Stack<TreeNode>();
	    while(root != null) {
	        list.add(root.val);
	        if (root.right != null) {
	            rights.push(root.right);
	        }
	        root = root.left;
	        if (root == null && !rights.isEmpty()) {
	        	root = rights.pop();
	        }
	    }
	    return list;
        
    }
	
	public class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
	}

}
