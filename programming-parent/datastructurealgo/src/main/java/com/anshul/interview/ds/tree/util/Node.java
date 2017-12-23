package com.anshul.interview.ds.tree.util;

/* Class containing left and right child of current
node and key value*/

public class Node {
	public int key;
	public Node left;
	public Node right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}
