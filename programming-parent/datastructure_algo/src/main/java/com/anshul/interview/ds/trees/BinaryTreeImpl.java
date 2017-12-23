package com.anshul.interview.ds.trees;
/**
 * 
 * Source: https://discuss.leetcode.com/topic/65792/recursive-easy-to-understand-java-solution
Algorithm:
1.	Recursively find the node that has the same value as the key, while setting 
the left/right nodes equal to the returned subtree.
2.  Once the node is found, have to handle the below 4 cases
		1. node doesn't have left or right - return null
		2. node only has left subtree- return the left subtree
		3. node only has right subtree- return the right subtree
 		4. node has both left and right - find the minimum value in 
 		the right subtree, set that value to the currently found node, 
 		then recursively delete the minimum value in the right subtree
 * @author explorer
 *
 */
public class BinaryTreeImpl {
	public class TreeNode{
		public TreeNode left, right;
		int data;
		public TreeNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}
	public TreeNode deleteNode(TreeNode root, int key) {
	    if(root == null){
	        return null;
	    }
	    if(key < root.data){
	        root.left = deleteNode(root.left, key);
	    }else if(key > root.data){
	        root.right = deleteNode(root.right, key);
	    }else{
	        if(root.left == null){
	            return root.right;
	        }else if(root.right == null){
	            return root.left;
	        }
	        
	        TreeNode minNode = findMin(root.right);
	        root.data = minNode.data;
	        root.right = deleteNode(root.right, root.data);
	    }
	    return root;
	}

	private TreeNode findMin(TreeNode node){
	    while(node.left != null){
	        node = node.left;
	    }
	    return node;
	}
	}
