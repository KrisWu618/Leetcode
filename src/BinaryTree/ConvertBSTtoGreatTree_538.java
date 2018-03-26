package BinaryTree;

import java.util.Stack;

public class ConvertBSTtoGreatTree_538 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	// recursion
	private int sum = 0;
	public TreeNode convertBST_recursion(TreeNode root) {
		if(root != null) {
			convertBST_recursion(root.right);
			sum += root.val;
			root.val =sum;
			convertBST_recursion(root.left);
		}
		
		return root;
	}
	
	//iterative
	
	public TreeNode convertBST_iterative(TreeNode root) {
		int all = 0;
		//initialize node, which points to the root
		TreeNode node = root;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(!stack.isEmpty() || node != null) {
			if(node != null) {
				stack.push(node);
				node = node.right;
			}else {
				node = stack.pop();
				all += node.val;
				node.val = all;
				node = node.left;
			}
			
		}
		
		
		return root;
	}
	



}
