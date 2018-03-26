package BinaryTree;

import BinaryTree.MinimumDepthofBinaryTree_111.TreeNode;

public class BalancedBinaryTree_110 {
	/*
	 * Given a binary tree, determine if it is height-balanced.
	 * For this problem, a height-balanced binary tree is defined as:
	 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
	 * */
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
		
	}
	
	// time complexity: O(n)
	// space complexity: O(n)
	public boolean isBalanced(TreeNode root) {
	    if (root == null) return true;
	    return helper(root) != -1;
	        
	    }
	public int helper (TreeNode root) {
		if (root == null) return 0;
		int l = helper(root.left);
		int r = helper(root.right);
		if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
			return -1; 
		}
		return Math.max(l, r) + 1;
		
	}



}
