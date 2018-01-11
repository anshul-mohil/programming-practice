package com.anshul.interview.algo.recurssion;

import com.anshul.interview.algo.Node;

public class BinaryTreePathApp {

	public static void main(String[] args) {
		BinaryTreePathPrinter tree = new BinaryTreePathPrinter();
	        tree.root = new Node(10);
	        tree.root.left = new Node(8);
	        tree.root.right = new Node(2);
	        tree.root.left.left = new Node(3);
	        tree.root.left.right = new Node(5);
	        tree.root.right.left = new Node(2);
	         
	        /* Let us test the built tree by printing Insorder traversal */
	        tree.printPaths(tree.root);
	}
}

class BinaryTreePathPrinter{
	Node root;
	
	public void printPaths(Node root2) {
		Integer[] path = new Integer[1000];
		printTreeRecur(root,path,0);
		
	}

	private void printTreeRecur(Node root, Integer[] path, int pathLength) {
		if(root == null)
		return;

		path[pathLength]  = root.data;
		pathLength++;

		// if current root is a leaf then print
		if(root.left == null && root.right == null)
			printPath(path,pathLength);
		else{
			// recursively call print for both half of tree triversal
			printTreeRecur(root.left, path, pathLength);
			printTreeRecur(root.right, path, pathLength);
		}
	}

	private void printPath(Integer[] path, int pathLength) {
		int i = 0;
		for (; i < pathLength-1; i++)
			System.out.print(path[i] + "-->");	
		System.out.println(path[i]);
		}	
}
