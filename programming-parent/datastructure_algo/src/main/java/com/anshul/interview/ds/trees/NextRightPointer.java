package com.anshul.interview.ds.trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Populate each level node's nextRight with the adjecent node at the same
 * level.
 * 
 * The idea is to do level order traversal using queue and while traversing
 * level by level we will populate this nextRight pointer
 * 
 * @author explorer
 *
 */
public class NextRightPointer {

	public Node root;

	public class Node {
		public int data;
		public Node left, right, nextRight;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public Node populateNextRightPointer() {

		if(root == null) return root;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		q.add(null);
		
		Node temp = null;
		while(! q.isEmpty()){
			temp = q.poll();
			
			if(temp == null){
				// if true that means we encounter delimeter
				if(q.peek() != null){
					q.add(null);
				}
			}
			else{
				// creating level order links
				temp.nextRight = q.peek();
				
				printNextPointer(temp);
				// pushing same level nodes into the queue
				if(temp.left != null)
					q.add(temp.left);
				if(temp.right != null)
					q.add(temp.right);
				
			}
		}
		return root;
	}
	private void printNextPointer(Node temp){
		if(temp.nextRight == null)
		System.out.println(temp.data + " --> " + root.nextRight);
		else
			System.out.print(temp.data + " --> ");
	}
}
