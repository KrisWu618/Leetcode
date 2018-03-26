package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
	}
	public List<String> BinaryTreePath (TreeNode root) {
		List<String> res = new ArrayList<String>();
		if (root != null) searchBT(root, "", res);
		return res;
	
	}
	
	public void searchBT(TreeNode root, String path, List<String> res) {
		if (root.left == null && root.right == null) res.add(path + root.val);
		if (root.left != null) searchBT(root.left, path + root.val + "->", res);
		if (root.right != null) searchBT(root.right, path + root.val + "->", res);
	}

}
