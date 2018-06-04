package BinaryTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TwoSumBST_653 {
	public class TreeNode {
		int val;
		TreeNode left, right;
		TreeNode (int x) {
			val = x;
		}
	}
	
	public boolean twoSumBST(TreeNode root, int target) {
		Set<Integer> set = new HashSet();
		return dfs(root, target, set);
	}
	
	
	public boolean dfs (TreeNode p, int target, Set<Integer> map) {
		if (p == null) return false;
		if (map.contains(target - p.val)) {
			return true;
		} else {
			map.add(p.val);
		}
		return dfs(p.left, target, map) || dfs(p.right, target, map);
	}

}
