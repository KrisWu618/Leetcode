package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBinaryTree_226 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x;}
	}
	
	
	/*
	 * Since each node in the tree is visited only once, 
	 * the time complexity is O(n), where n is the number of nodes in the tree.
	 *  We cannot do better than that, since at the very least we have to visit each node to invert it.
	 *  Because of recursion, O(h) function calls will be placed on the stack in the worst case, 
	 *  where h is the height of the tree. Because h∈O(n), the space complexity is O(n).
	 * */
	public TreeNode invertTree(TreeNode root) {
		if(root == null) return null;
		
		TreeNode right = invertTree(root.right);
		TreeNode left = invertTree(root.left);
		root.left = right;
		root.right = left;
		return root;
        
    }
	

	/*
	 * The idea is that we need to swap the left and right child of all nodes in the tree. 
	 * So we create a queue to store nodes whose left and right child have not been swapped yet. 
	 * Initially, only the root is in the queue. As long as the queue is not empty, 
	 * remove the next node from the queue, swap its children, 
	 * and add the children to the queue. 
	 * Null nodes are not added to the queue. 
	 * Eventually, the queue will be empty and all the children swapped, 
	 * and we return the original root.
	 * 
	 * */
	
	/*
	 * Complexity Analysis
	 * Since each node in the tree is visited / added to the queue only once, 
	 * the time complexity is O(n), where n is the number of nodes in the tree.
	 * Space complexity is O(n), since in the worst case, 
	 * the queue will contain all nodes in one level of the binary tree. 
	 * For a full binary tree, the leaf level has n/2 = O(n) leaves.
	 * */
	
	public TreeNode inverTree_iterate(TreeNode root) {
		if(root == null) return null;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode current = queue.poll();
			TreeNode temp = current.left;
			current.left = current.right;
			current.right = temp;
			if(current.left != null) queue.add(current.left);
			if(current.right != null ) queue.add(current.right);
			
		}
		return root;
	}
	

}
