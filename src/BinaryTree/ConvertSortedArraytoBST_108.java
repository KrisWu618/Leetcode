package BinaryTree;

public class ConvertSortedArraytoBST_108 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode (int x) {
			val = x;
		}
		
		public TreeNode sortedArrayToBST(int[] nums) {
			if (nums.length == 0) return null;
			int left = 0, right = nums.length - 1;
			TreeNode root = helper(nums, left, right);
			
			return root;
		}
		
		public TreeNode helper(int[] nums, int left, int right) {
			if (left > right) return null;
			int mid = (right - left)/2 + left;
			TreeNode node = new TreeNode(nums[mid]);
			node.right = helper(nums, left, mid -1);
			node.right = helper(nums, mid + 1, right);
			
			return node;
		}
	}



}
