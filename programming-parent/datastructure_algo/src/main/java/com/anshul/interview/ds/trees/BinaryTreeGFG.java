package com.anshul.interview.ds.trees;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a tree and a sum, return true if there is a path from the root down to
 * a leaf, such that adding up all the values along the path equals the given
 * sum.
 * 
 * Strategy: subtract the node value from the sum when recurring down and check
 * to see if the sum is 0 when you run out of tree.
 * 
 * @author explorer
 *
 */
public class BinaryTreeGFG {

	private Node root;
/**
Not for revision
 */
	public boolean geeksforgeeks_pathSum(Node node, int sum) {
		if (node == null)
			return (sum == 0);
		else {
			boolean ans = false;

			/* otherwise check both subtrees */
			int subsum = sum - node.data;
			// if reach a leaf
			if (subsum == 0 && node.left == null && node.right == null)
				return true;
			// if not a leaf or sum not achieved
				ans =  ans || geeksforgeeks_pathSum(node.left, subsum);
				ans = ans || geeksforgeeks_pathSum(node.right, subsum);
			return ans;
		}
	}

	public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList();
        if (root == null) return res;
        dfs(root, sum, res, new ArrayList());
        return res;
    }
    private void dfs(TreeNode root, int target, List<List<Integer>> res, List<Integer> list) {
        if (root == null) return;
        list.add((Integer) root.data);
        if (root.left == null && root.right == null && target == (Integer)root.data)
            res.add(new ArrayList(list));
        dfs(root.left, target - (Integer)root.data, res, list);
        dfs(root.right, target - (Integer)root.data, res, list);
        list.remove(list.size() - 1);
    }
	
	
	
	/* Driver program to test the above functions */
	public static void main(String args[]) {
		int sum = 18;
	         
	        /* Constructed binary tree is
	              10
	             /  \
	           8     2
	          / \   /
	         3   5 2
	        */
		BinaryTreeGFG tree = new BinaryTreeGFG();
		tree.root = tree.new Node(10);
		tree.root.left = tree.new Node(8);
		tree.root.right = tree.new Node(2);
		tree.root.left.left = tree.new Node(-3);
		tree.root.left.right = tree.new Node(5);
		tree.root.right.left = tree.new Node(2);

		if (tree.geeksforgeeks_pathSum(tree.root, sum))
			System.out.println("There is a root to leaf path with sum " + sum);
		else
			System.out.println("There is no root to leaf path with sum " + sum);
	}

	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}
}
