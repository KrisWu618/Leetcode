package BinaryTree;
import java.util.Stack;

public class BinaryTree {
	
	public static class TreeNode{
		int data;
		TreeNode left;
		TreeNode right;
		TreeNode(int data){
			this.data = data;
		}
	}
	
	public void preOrder(TreeNode root) {
		if(root == null) return;
		System.out.printf("%s ", root.data); 
		preOrder(root.left);
		preOrder(root.right);
		return;
	}
	
	
	public void preOrderWithoutRecursion(TreeNode root) { 
		Stack<TreeNode> nodes = new Stack<>();
		nodes.push(root); 
		while (!nodes.isEmpty()) { 
			TreeNode current = nodes.pop(); 
			System.out.printf("%s ", current.data); 
			if (current.right != null) { 
				nodes.push(current.right); 
				} 
			if (current.left != null) { 
				nodes.push(current.left); 
				} 
			} 
		}
	
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree bi = new BinaryTree();
		TreeNode rootNode = createBinaryTree();
		System.out.println("iterative"); 
		bi.preOrderWithoutRecursion(rootNode);
		System.out.println("");
		System.out.println("recursion");
		bi.preOrder(rootNode);

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
