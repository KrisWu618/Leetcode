package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageOfLevelsInBinaryTree_637 {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	// BFS
	public List<Double> averageOfLevels(TreeNode root) {
		List<Double> result = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		
		if(root == null) return result;
		q.add(root);
		while(!q.isEmpty()) {
			int n  = q.size();
			double sum = 0.0;
			for(int i = 0; i < n; i++) {
				TreeNode cur = q.poll();
				sum += cur.val;
				if(cur.left != null) q.offer(cur.left);
				if(cur.right != null) q.offer(cur.right);
				
			}
			result.add(sum / n);
		}
		
		
        
		return result; 
    }
	
	// DFS with recursion
	public List<Double> averageOfLevels_dfs(TreeNode root) {
		List<Double> result = new ArrayList<>();
		List<Integer> counter = new ArrayList<>();
		
		// using dfs to sum all value in same level and count number of node in same level   
		dfs(0, root, result, counter);
		
		for(int level = 0; level < result.size(); level ++) {
			result.set(level, result.get(level)/counter.get(level));
		}
		
        
		return result; 
    }
	public void dfs(int level, TreeNode node, List<Double> result, List<Integer> counter) {
		if(node == null) return;
		
		if (result.size() <= level) {
            result.add(0.0);
            counter.add(0);
        }
		
		result.set(level, result.get(level) + node.val);
		counter.set(level,counter.get(level) + 1 );
		
		// go left node and right node
		dfs(level + 1, node.left, result, counter);
		dfs(level + 1, node.right, result, counter);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		TreeNode rootNode = createBinaryTree();
		//List<Double> results = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.add(rootNode);
		System.out.println(q.size());
		
		AverageOfLevelsInBinaryTree_637 a = new AverageOfLevelsInBinaryTree_637();
		System.out.println(a.averageOfLevels(rootNode));
		

	}
	
	public static TreeNode createBinaryTree() {
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(10);
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
