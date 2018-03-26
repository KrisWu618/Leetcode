package BinaryTree;

import java.util.Stack;

import BinaryTree.Traversal.TreeNode;

public class Traversal_Iterative {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	// preorder
	// https://www.youtube.com/watch?v=elQcrJrfObg
	public void PreOrder(TreeNode root) {
		// base case
		if(root == null) return;
		
		// Create empty stack and push root node
		Stack<TreeNode> stack =new Stack<TreeNode>();
		stack.push(root);
		
		// run until stack is empty
		while(!stack.isEmpty()) {
			//pop the current node and print it
			TreeNode current = stack.pop();
			System.out.println(current.val);
			
			// right child is pushed first, it will be popped after left child
			// push right child to stack
			if(current.right != null) {
				stack.push(current.right);
			}
			
			// push left child to stack
			if(current.left != null) {
				stack.push(current.left);
			}
			
			
		}
	}
	
	// Postorder
	// https://www.youtube.com/watch?v=qT65HltK2uE
	public void PostOrder(TreeNode root) {
		if(root == null) return;
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		// push root into stack1
		stack1.push(root);
		
		while(!stack1.isEmpty()) {
			
			// pop root and push it to stack2
			// push root.left and root.right to stack1
			TreeNode current = stack1.pop();
			stack2.push(current);
			if(current.left != null) {
				stack1.push(current.left);
			}
			
			if(current.right != null) {
				stack1.push(current.right);
			}
		}
		
		while(!stack2.isEmpty()) {
			TreeNode current = stack2.pop();
			System.out.println(current.val);
		}
	}
	
	
	//Inorder. 
	// https://www.youtube.com/watch?v=nzmtCFNae9k
	// if root is not null, push it into stack, and move to left child
	// if root is null, pop out from stack, and move to right
	public void InOrder(TreeNode root){
		if(root == null) return;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		while(!stack.isEmpty() || root != null) {
			if(root != null) {
				stack.push(root);
				root = root.left;
			}else {
				//if(stack.isEmpty()) break;
				root = stack.pop();
				System.out.println(root.val);
				root = root.right;
			}
			
		}
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Traversal_Iterative traversal = new  Traversal_Iterative();
		TreeNode rootNode = createBinaryTree();
		
		System.out.println("Preorder");
		traversal.PreOrder(rootNode);
		System.out.println("------------");
		System.out.println("Postorder");
		traversal.PostOrder(rootNode);
		System.out.println("------------");
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
