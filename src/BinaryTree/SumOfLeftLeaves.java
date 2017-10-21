package BinaryTree;

import java.util.Stack;

public class SumOfLeftLeaves {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	/*
	 *Recursive method. 
	 *For given node we check whether its left child is a leaf. 
	 *If it is the case, we add its value to answer, 
	 *otherwise recursively call method on left child. 
	 *For right child we call method only if it has at least one nonnull child. 
	 */
	public int sumOfLeftLeaves(TreeNode root) {
		if ( root == null ) return 0;
	    int result = 0;
	    if ( root.left != null && root.left.left == null && root.left.right == null) {
	        result += root.left.val;
	    }
	    return result + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right); 
	       
	}	

/*
 *Iterative method. 
 *Here for each node in the tree we check whether its left child is a leaf. 
 *If it is true, we add its value to answer, 
 *otherwise add left child to the stack to process it later. 
 *For right child we add it to stack only if it is not a leaf. 
 */
	
	public int sumOfLeftLeaves_iterative(TreeNode root) {
		if(root != null) return 0;
		int sums = 0;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		
		while(!stack.empty()) {
			TreeNode node = stack.pop();
			if(node.left != null) {
				if(node.left.left == null && node.left.right == null) 
					sums += node.left.val;
				else 
					stack.push(node.left);
				
			}
			
			if(node.right != null) {
				if(node.right.left != null || node.right.right != null) 
					stack.push(node.right);
				
			}
			
		}
		return sums;
		
	}
		
}
