package BinaryTree;

/*
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.

Note:

Given target value is a floating point.
You are guaranteed to have only one unique value in the BST that is closest to the target.
Example:

Input: root = [4,2,5,1,3], target = 3.714286

    4
   / \
  2   5
 / \
1   3

Output: 4

 * 
 * 
 * */


public class ClosestBinarySearchTreeValue_270 {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
	}
	
	
	public int closestValue(TreeNode root, double target) {
		int res = root.val; // initiate res value
		while(root != null) {
			// check the closer value
			if (Math.abs(root.val - target) < Math.abs(target - res)) {
				res = root.val;
			}
			
			// update root
			// if root.val > target, looking for closer value in the left child
			root = root.val > target? root.left : root.right;	
			
		}
		return res;
	}
	
	

}
