package com.suiyue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.suiyue.BinaryTreePreorderTraversal.TreeNode;

public class BinaryTreeInorderTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		List<Integer> result = new ArrayList<Integer>();
		if(root == null) return result;
		TreeNode tNode = null;
		TreeNode outNode = null;
		stack.push(root);
		while(!stack.isEmpty()) {
			tNode = stack.pop();
			if(tNode.right != null 
					&& !(outNode != null && outNode == tNode.right)
					&& !(outNode != null && outNode.right == null)) {
				stack.push(tNode.right);
			}
			stack.push(tNode);
			if(tNode.left != null 
					&& !(outNode != null && outNode == tNode.right)
					&& !(outNode != null && outNode.right == null)) {
				stack.push(tNode.left);
			}
			if(tNode.left == null
					|| (outNode != null && tNode.right == outNode)
					|| (outNode != null && outNode.right == null)) {
				outNode = stack.pop();
				result.add(outNode.val);
			}
		}
		return result;
        
    }
	

}
