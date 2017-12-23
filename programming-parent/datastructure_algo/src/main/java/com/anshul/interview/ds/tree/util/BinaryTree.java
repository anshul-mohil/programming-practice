package com.anshul.interview.ds.tree.util;

//A Java program to introduce Binary Tree

public class BinaryTree {

	// Root of Binary Tree
	public Node root;

	// Constructors
	public BinaryTree(int key) {
		root = new Node(key);
	}

	// A utility class to pass heigh object
	public class Height {
		public int h;
	}

	public BinaryTree() {
		root = null;
	}

	public int getBinaryTreeHeight(Node root) {
		return getHeight(root, 0);
	}

	public int getHeight(Node root, int level) {

		if (root == null)
			return --level;
		// going to next level
		level++;
		int lHeight = getHeight(root.left, level);
		int rHeight = getHeight(root.right, level);

		return Integer.max(lHeight, rHeight);
	}

	/*
	 * define height =0 globally and call diameterOpt(root,height) from main
	 */
	  public int diameterOpt(Node root, Height height)
	    {
	        /* lh --> Height of left subtree
	           rh --> Height of right subtree */
	        Height lh = new Height(), rh = new Height();
	 
	        if (root == null)
	        {
	            height.h = 0;
	            return 0; /* diameter is also 0 */
	        }
	         
	        /* ldiameter  --> diameter of left subtree
	           rdiameter  --> Diameter of right subtree */ 
	        /* Get the heights of left and right subtrees in lh and rh
	         And store the returned values in ldiameter and ldiameter */
	        lh.h++;     rh.h++; 
	        int ldiameter = diameterOpt(root.left, lh);
	        int rdiameter = diameterOpt(root.right, rh);
	 
	        /* Height of current node is max of heights of left and
	         right subtrees plus 1*/
	        height.h = Math.max(lh.h, rh.h) + 1;
	 
	        return Math.max(lh.h + rh.h + 1, Math.max(ldiameter, rdiameter));
	    }
	  public int diameter(){ 
	        Height height = new Height();
	        return diameter(root,height);
	    }
	    private int diameter(Node root, Height height){
	        
	        if(root == null){ 
	            return 0; 
	        } 
	         
	        Height leftHeight = new Height();
	        Height rightHeight = new Height();
	        int dial = diameter(root.left,leftHeight);
	        int diar = diameter(root.right,rightHeight);
	        height.h = Math.max(leftHeight.h, rightHeight.h) + 1;
	        return Math.max(Math.max(dial, diar),(1 + leftHeight.h + rightHeight.h));
	    } 
	public int getHeightAlternativeSolution(Node root) {
		if (root == null)
			return -1;
		int lHeight = 1 + getHeightAlternativeSolution(root.left);
		int rHeight = 1 + getHeightAlternativeSolution(root.right);

		return Integer.max(lHeight, rHeight);
	}

}