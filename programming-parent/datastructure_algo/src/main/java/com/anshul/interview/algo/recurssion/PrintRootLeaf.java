package com.anshul.interview.algo.recurssion;

import java.util.*;
 
class Node {
	int data;
	Node leftNode;
	Node rightNode;
 
	public Node(int data)	{
		this.data = data;
	}
 
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getleftNode() {
		return leftNode;
	}
	public void setleftNode(Node leftNode) {
		this.leftNode = leftNode;
	}
	public Node getRightNode() {
		return rightNode;
	}
	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
 
}
 
public class PrintRootLeaf {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = createTree();
		printRoot(root);
 
	}
 
	private static void printRoot(Node root) {
		// TODO Auto-generated method stub
		Stack<Node> stack = new Stack<Node>();
		Node current = root;
		String display = "";
		while (true)	{
			if (current != null)	{
				display = display + current.data + " ";
				if (current.rightNode != null)
						stack.push(current);
				if (current.getleftNode() == null && current.getRightNode() == null)
					System.out.println(display);
				current = current.leftNode;
			}
 
			else if ( !stack.isEmpty()) {
				current = stack.pop();
				//System.out.println(display);
				int index = display.indexOf("" + current.data);
				display = display.substring(0, index + ("" + current.data).length() + 1);
				current = current.rightNode;
			}
			
			else 	{
				break;
			}
		}
 
	}
 
	private static Node createTree() {
		// TODO Auto-generated method stub
 
		Node root = new Node(10);
	    root.leftNode = new Node(8);
	    root.rightNode = new Node(2);
	    root.leftNode.leftNode = new Node(3);
	    root.leftNode.rightNode = new Node(5);
	    root.rightNode.leftNode = new Node(2);
		/*Node root = new Node(6);
		root.leftNode = new Node(3);
		root.leftNode.leftNode = new Node(2);
		root.leftNode.rightNode = new Node(5);
		root.leftNode.rightNode.leftNode = new Node(7);
		root.leftNode.rightNode.rightNode = new Node(4);
		root.rightNode = new Node(5);
		root.rightNode.rightNode = new Node(4);*/
		return root;
	}
 
}
 

