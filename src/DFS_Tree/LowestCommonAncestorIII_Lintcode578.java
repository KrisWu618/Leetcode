package DFS_Tree;

/*
 * Given the root and two nodes in a Binary Tree.
 * Find the lowest common ancestor(LCA) of the two nodes.
 * The lowestcommon ancestor is the node with largest depth which is the ancestor of both nodes
 * return null if LCA does not exist
 * 
 * */

// we need to check whether TreeNode A and B in the binary tree.
// if they do, return the lowest common ancestor
public class LowestCommonAncestorIII_Lintcode578 {
	TreeNode res = null; // global variable to store the result 
	
	public Result dfs(TreeNode p, TreeNode A, TreeNode B) {
		// base case
		if (p == null) {
			return new Result(false, false);
		}
		
		// recursion
		Result left = dfs(p.left, A, B);
		Result right = dfs(p.right, A,B);
		
		// logic execution
		boolean a = left.aexist || right.aexist || p == A;
		boolean b = left.bexist || right.bexist || p == B;
		
		// update global variable
		if (a && b && res == null) {
			res = p; 
		}
		// return result for recursion
		return new Result(a, b);
		
	}
	
	public TreeNode LCA(TreeNode root, TreeNode A, TreeNode B) {
		dfs(root, A, B);
		return res;
	}
	
	// construct class to store result for recursion
	public class Result {
		public boolean aexist;
		public boolean bexist;
		
		public Result (boolean a, boolean b) {
			aexist = a;
			bexist = b;
		}
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
