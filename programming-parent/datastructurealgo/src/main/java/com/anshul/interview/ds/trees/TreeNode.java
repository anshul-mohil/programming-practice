package com.anshul.interview.ds.trees;

public class TreeNode<T extends Comparable<T>>{
	public TreeNode left, right;
	T data;
	public TreeNode(T data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
}