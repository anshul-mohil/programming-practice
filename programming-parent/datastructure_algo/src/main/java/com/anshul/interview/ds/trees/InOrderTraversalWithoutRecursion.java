package com.anshul.interview.ds.trees;

import java.util.Deque;
import java.util.LinkedList;

//non-recursive java program for inorder traversal

/* importing the necessary class */
import java.util.Stack;



/* Class to print the inorder traversal */
public class InOrderTraversalWithoutRecursion {
	/* Class containing left and right child of current 
	node and key value*/
	static class Node {

		int data;
		Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}
	Node root;

	public void inorder() {
		if (root == null)
			return;
		Node curr = root;
		Stack<Node> s = new Stack<Node>();
		while (curr != null) {
			s.push(curr);
			curr = curr.left;

			while (curr == null && !s.isEmpty()) {
				Node poped = s.pop();
				System.out.print(poped.data + " ");
				curr = poped.right;
			}
		}
	}
    public void postOrderItrOneStack(Node root){ 
        Node current = root; 
        Deque<Node> stack = new LinkedList<>();
        while(current != null || !stack.isEmpty()){ 
            if(current != null){ 
                stack.addFirst(current); 
                current = current.left; 
            }else{ 
                Node temp = stack.peek().right; 
                if (temp == null) { 
                    temp = stack.poll(); 
                    System.out.print(temp.data + " ");
                    while (!stack.isEmpty() && temp == stack.peek().right) { 
                        temp = stack.poll(); 
                        System.out.print(temp.data + " ");
                    } 
                } else { 
                    current = temp; 
                } 
            } 
        } 
    }
	

//	public static void main(String args[]) {
//
//		/*
//		 * creating a binary tree and entering the nodes
//		 */
//		InOrderTraversalWithoutRecursion tree = new InOrderTraversalWithoutRecursion();
//		tree.root =  new InOrderTraversalWithoutRecursion.Node(1);
//		tree.root.left = new InOrderTraversalWithoutRecursion().new Node(2);
//		tree.root.right = new InOrderTraversalWithoutRecursion().new Node(3);
//		tree.root.left.left = new InOrderTraversalWithoutRecursion().new Node(4);
//		tree.root.left.right = new InOrderTraversalWithoutRecursion().new Node(5);
//		tree.root.left.left.right = new InOrderTraversalWithoutRecursion().new Node(6);
////		tree.root.left.left.left = new Node(7);
//		//tree.inorder();
//		 tree.postOrderItrOneStack(tree.root);
//	}
}