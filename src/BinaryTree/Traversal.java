package BinaryTree;

import BinaryTree.BinaryTree.TreeNode;

public class Traversal {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}
	/*Steps for PreOrder traversal are:
	 * 1. Visit the node.
	 * 2. Traverse the left subtree in PreOrder.
	 * 3. Traverse the right subtree in PreOrder.
	 * */
	public void PreOrder(TreeNode root) {
		if(root != null) {
			System.out.println(root.val);
			PreOrder(root.left);
			PreOrder(root.right);
		}
	}
	
	
	/*Steps for PreOrder traversal are: 
	 * 1. Traverse the left subtree in PreOrder.
	 * 2. Traverse the right subtree in PreOrder.
	 * 3. Visit the node.
	 * */
	public void PostOrder(TreeNode root) {
		if(root != null) {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.println(root.val);
		}
	}
	
	
	/*Steps for PreOrder traversal are: 
	 * 1. Traverse the left subtree in PreOrder.
	 * 3. Visit the node.
	 * 2. Traverse the right subtree in PreOrder.
	 * */
	public void InOrder(TreeNode root) {
		if(root != null) {
			InOrder(root.left);
			System.out.println(root.val);
			InOrder(root.right);
		}
	}
	
	
   // Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Traversal traversal = new Traversal();
		TreeNode rootNode = createBinaryTree();
		
		System.out.println("Preorder");
		traversal.PreOrder(rootNode);
		System.out.println("----------------");
		System.out.println("Postorder");
		traversal.PostOrder(rootNode);
		System.out.println("----------------");
		System.out.println("Inorder");
		traversal.InOrder(rootNode);

	}
	
	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		
		node20.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		node60.right = node70;
		
		return rootNode;
		
		
	}

}
