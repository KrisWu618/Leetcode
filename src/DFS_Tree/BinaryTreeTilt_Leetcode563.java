package DFS_Tree;


/*
 * https://leetcode.com/problems/binary-tree-tilt/description/
 * Given a binary tree, return the tilt of the whole tree.
 * The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values 
 * and the sum of all right subtree node values. Null node has tilt 0.
 * The tilt of the whole tree is defined as the sum of all nodes' tilt.
 * 
 * Input: 
 *       1
 *     /   \
 *    2     3
 * Output: 1
 * Explanation: 
 * Tilt of node 2 : 0
 * Tilt of node 3 : 0
 * Tilt of node 1 : |2-3| = 1
 * Tilt of binary tree : 0 + 0 + 1 = 1
 * 
 * Time complexity: O(n). where n is the number of nodes. Each node is visited once.
 * Space complexity: O(n). In worst case when the tree is skewed depth of tree will be n. 
 * In average case depth will be logn.
 * */

public class BinaryTreeTilt_Leetcode563 {
	int tilt = 0; // a global variable to store the tilt sum
	
	public int findTilt(TreeNode root) {
		dfs(root);
		return tilt;
	}

	private int dfs(TreeNode root) {
		// base case
		if (root == null) return 0;
		
		// recursion
		int left = dfs(root.left);
		int right = dfs(root.right);
		
		// logic execution
		// update global variable
		tilt += Math.abs(left - right); // calculate the store the tilt
		
		// return result for recursion
		return left + right + root.val; // return the sum of subtree node values
	}

	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
	}
	

}
