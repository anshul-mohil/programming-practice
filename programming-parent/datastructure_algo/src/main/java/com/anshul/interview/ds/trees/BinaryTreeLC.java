package com.anshul.interview.ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLC {
	/**
	 * width and avg of levels are pretty much similar.
	 * So I will be doing only this one.
	 * 
	 * Below solution is wrong need to look into.
	 * remove null delimeter as its seems unnesscerray.
	 * @param root
	 * @return
	 */
	public List<Float> avgOfLevels(Node root){
		List<Float> list = new LinkedList<Float>();
		
		if(root == null)
			return list;
		
		int sum = 0, currCount = 0, count = 0, max = 0;
		Float avg = 0.0f;
		Node temp = null;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		//q.add(null);
		
		while(!q.isEmpty()){
			
			currCount = count = q.size()-1;
			max = Math.max(max,currCount);
		
			temp = q.peek();			
			if(temp == null){
				temp = q.poll();
				if(q.peek() != null){
					q.add(null);
				}
			}
			else{
				while(count-- > 0 && !q.isEmpty()){
					temp = q.poll();
					sum +=temp.data;
					if(temp.left != null)
						q.add(temp.left);
					if(temp.right != null)
						q.add(temp.right);
				}
				avg= (float) (sum/currCount);	
				sum = 0;
				list.add(avg);
			}
			
			
		}//outer while
		
		return list;
	}
	/**
	 * Inorder traversal to merge two binary trees
	 * @param r1
	 * @param r2
	 * @return
	 */
	public Node merge2BinaryTrees(Node r1, Node r2) {
		if(r1 == null || r2 == null)
			return (r1 == null)?r2 : r1;
		r1.data +=r2.data;
		
		r1.left = merge2BinaryTrees(r1.left, r2.left);
		r1.right = merge2BinaryTrees(r1.right, r2.right);
		
		return r1;
	}

	// Function to find the maximum width of 
    // the tree using level order traversal
    public int maxwidth(Node root) 
    {
        // Base case
        if (root == null)
            return 0;
         
        // Initialize result
        int maxwidth = 0;
         
        // Do Level order traversal keeping 
        // track of number of nodes at every level
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) 
        {
            // Get the size of queue when the level order
            // traversal for one level finishes
            int count = q.size();
             
            // Update the maximum node count value
            maxwidth = Math.max(maxwidth, count);
             
            // Iterate for all the nodes in 
            // the queue currently
            while (count-- > 0) 
            {
                // Dequeue an node from queue
                Node temp = q.remove();
             
                // Enqueue left and right children 
                // of dequeued node
                if (temp.left != null) 
                    q.add(temp.left);
                if (temp.right != null) 
                    q.add(temp.right);
            }
        }
        return maxwidth;
    }
 
	public int maxDepth(Node root) {
		if (root == null)
			return 0;

		int lh = maxDepth(root.left);
		int rh = maxDepth(root.right);

		return maxIn(lh, rh) + 1;
	}

	private int maxIn(int lh, int rh) {
		if (lh > rh)
			return lh;
		else
			return rh;
	}


	/**
	 * LeetCode
	 * 
	 * @param root
	 * @return
	 */
	public int minDepth(Node root) {
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		return (left == 0 || right == 0) ? left + right + 1 : Math.min(left, right) + 1;
	}

	// 1. Recursive: My solution for revision
	public List<List<Integer>> pathSum(Node root, int sum) {
		if (root == null)
			return new ArrayList<List<Integer>>();
		return pathSumInner(root, sum, new Stack<Integer>(), new ArrayList<List<Integer>>());
	}

	private List<List<Integer>> pathSumInner(Node root, int sum, Stack<Integer> path, List<List<Integer>> resultList) {
		if (root == null)
			return resultList;

		path.push((Integer) root.data);

		pathSumInner(root.left, sum - (Integer) root.data, path, resultList);
		pathSumInner(root.right, sum - (Integer) root.data, path, resultList);

		if (root.left == null && root.right == null && sum == (Integer) root.data)
			resultList.add(new ArrayList<Integer>(path));

		path.pop();

		return resultList;
	}
	public Integer sumRootToLeaf(Node root){
		List<List<Integer>> l = rootToLeafPath(root);
		
		String temp = "";
		int tempInt = 0;
		
		for (List<Integer> list : l) {
			for (Integer integer : list)
				temp += String.valueOf(integer);
			tempInt += Integer.valueOf(temp);
			temp = "";
		}
		return tempInt;
	}
	/**
	 * Print root to leaf paths
	 * 
	 * @param args
	 */
	public List<List<Integer>> rootToLeafPath(Node root) {
		if (root == null)
			return new ArrayList<List<Integer>>();
		return rootToLeafPathInner(root, new Stack<Integer>(), new ArrayList<List<Integer>>());
	}

	private List<List<Integer>> rootToLeafPathInner(Node root, Stack<Integer> path, List<List<Integer>> resultList) {
		if (root == null)
			return resultList;

		path.push((Integer) root.data);
		
		rootToLeafPathInner(root.left, path, resultList);
		rootToLeafPathInner(root.right, path, resultList);
		
		if (root.left == null && root.right == null)
			resultList.add(new ArrayList<Integer>(path));

		path.pop();

		return resultList;
	}
	
	/* Driver program to test the above functions */
	public static void main(String args[]) {
		BinaryTreeLC tree1 = new BinaryTreeLC();
//		tree1.root = tree1.new Node(100);
//		tree1.root.left = tree1.new Node(50);
//		tree1.root.right = tree1.new Node(300);
//		tree1.root.left.left = tree1.new Node(20);
//		tree1.root.left.right = tree1.new Node(70);

		
		//
		// tree1.root.left.left.left = tree1.new Node(7);
		// tree1.root.left.left.right = tree1.new Node(5);
		// tree1.root.left.left.right.left = tree1.new Node(2);
		//
		// tree1.root.right.left = tree1.new Node(13);
		// tree1.root.right.right = tree1.new Node(4);
		//
		// tree1.root.right.right.right = tree1.new Node(1);

		BinaryTreeLC tree = new BinaryTreeLC();
		tree.root = tree.new Node(5);
		tree.root.left = tree.new Node(4);
		tree.root.right = tree.new Node(8);

		tree.root.left.left = tree.new Node(1);
		tree.root.left.left.left = tree.new Node(7);
		tree.root.left.left.right = tree.new Node(5);
		tree.root.left.left.right.left = tree.new Node(2);

		tree.root.right.left = tree.new Node(13);
		tree.root.right.right = tree.new Node(4);

		tree.root.right.right.right = tree.new Node(1);

		Integer sum = tree.sumRootToLeaf(tree.root);
		System.out.println(sum);
//		List<Float> l = tree.avgOfLevels(tree.root);
//		for (Float integer : l) {
//			System.out.println(integer);
//		}
//		Node mergedTree = new BinaryTreeLC().merge2BinaryTrees(tree.root, tree1.root);
//
//		new BinaryTreeLC().preOrderPrint(mergedTree);
	}

	private void preOrderPrint(Node root) {
		if(root == null)
			return;
		System.out.println(root.data);
		preOrderPrint(root.left);
		preOrderPrint(root.right);
	}
	public class Node {
		public int data;
		public Node left, right;

		public Node(int item) {
			data = item;
			left = right = null;
		}
	}

	public Node root;


	/**
	 * GeeksForGeeks
	 * 
	 * @param root
	 * @return
	 */
	public int minimumDepth(Node root) {
		// Corner case. Should never be hit unless the code is
		// called on root = NULL
		if (root == null)
			return 0;

		// Base case : Leaf Node. This accounts for height = 1.
		if (root.left == null && root.right == null)
			return 1;

		// If left subtree is NULL, recur for right subtree
		if (root.left == null)
			return minimumDepth(root.right) + 1;

		// If right subtree is NULL, recur for right subtree
		if (root.right == null)
			return minimumDepth(root.left) + 1;

		return Math.min(minimumDepth(root.left), minimumDepth(root.right)) + 1;
	}
}
