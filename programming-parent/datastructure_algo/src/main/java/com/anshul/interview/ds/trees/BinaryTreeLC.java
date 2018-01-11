package com.anshul.interview.ds.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeLC {
	
	static int preIndex;
	static int postIndex;

	public static void main(String args[]) {

		// For PreOrder and InOrder
		BinaryTreeLC tree = new BinaryTreeLC();

		int in[] = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
		int post[] = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };
		int pre[] = new int[] { 1, 2, 4, 8, 5, 3, 6, 7 };

		int len = in.length;
		postIndex = len - 1;
		preIndex = 0;
		Node root = tree.constructBTFromInOrderPreOrder(in, pre, 0, len - 1);

		// building the tree by printing inorder traversal
		System.out.println("Inorder traversal of constructed tree is : ");
		tree.printInorder(root);

		Node root2 = tree.constructBTFromInOrderPostOrder(in, post, 0, len - 1);
		System.out.println("Preorder of the constructed tree : ");
		tree.printInorder(root2);
	}
	/* This funtcion is here just to test buildTree() */
   private void printInorder(Node node) 
    {
        if (node == null)
            return;
  
        /* first recur on left child */
        printInorder(node.left);
        
        /* then print the data of node */
        System.out.print(node.data + " ");
  
        /* now recur on right child */
        printInorder(node.right);
    }

	public Node constructBTFromInOrderPreOrder(int[] in, int[] pre, int inStart, int inEnd) {
		// base case only true for the last element in inOder list
		if(inStart > inEnd)
			return null;
		
		Node newNode = new Node(pre[preIndex++]);
		// if instart == inEnd that means there is no leafs further
		if(inStart == inEnd)
			return newNode;
		
		// if reaches here that means there is left and right tree to this node exist
		int inIndex = getInOrderIndex(in, inStart,inEnd,newNode.data);
		
		newNode.left = constructBTFromInOrderPreOrder(in, pre, inStart, inIndex-1);
		newNode.right = constructBTFromInOrderPreOrder(in, pre, inIndex+1, inEnd);
		return newNode;
	}
	
	
	public Node constructBTFromInOrderPostOrder(int[] in, int[] post, int inStart, int inEnd) {
		// base case only true for the last element in inOder list
		if(inStart > inEnd)
			return null;
		
		Node newNode = new Node(post[postIndex--]);

		// if instart == inEnd that means there is no leafs further
		if(inStart == inEnd)
			return newNode;
		
		// if reaches here that means there is left and right tree to this node exist
		int inIndex = getInOrderIndex(in, inStart,inEnd,newNode.data);
		
		newNode.right = constructBTFromInOrderPostOrder(in, post, inIndex+1, inEnd);
		newNode.left = constructBTFromInOrderPostOrder(in, post, inStart, inIndex-1);
		
		return newNode;
	}
	
	private int getInOrderIndex(int[] in, int inStart, int inEnd, int value){
		int i = 0;
		for (i = inStart; i <= inEnd; i++) 
			if(in[i]==value)
				return i;
		return i;
		
	}
	
	Node prev = null;
	public void flatternBinaryTree(Node root){
		
		if(root == null) return;
		
		flatternBinaryTree(root.right);
		flatternBinaryTree(root.left);
		
		root.right = prev;
		root.left = null;
		prev = root;
	}
	
	/**
	 * 
	 * @param root
	 */
	public void printCommonNodesFromRoot(Node root, int val1, int val2){
		List<Integer> l1 = getElementPath(root, val1);
		List<Integer> l2 = getElementPath(root, val2);
		
		int j = 0;
		for (j = 0; j < l1.size() && j < l2.size(); j++) {
			
			// break where first element met
			if (l1.get(j) != l2.get(j))
				break;
			System.out.println(l1.get(j) + "  --> ");
		}
	}
	
	/**
	 * 
	 * @param root
	 * @param val1
	 * @param val2
	 * @return
	 */
	public Integer distanceBetween2NodeOfBT(Node root, int val1, int val2) {
		List<Integer> l1 = getElementPath(root, val1);
		List<Integer> l2 = getElementPath(root, val2);

		if (l1.isEmpty() || l2.isEmpty())
			return -1;
		int j = 0;
		for (j = 0; j < l1.size() && j < l2.size(); j++) {
			// break where first element met
			if (l1.get(0) != l2.get(0))
				break;
			l1.remove(0);
			l2.remove(0);
		}
		return l1.size() + l2.size();
	}

	public Integer findLCA_withPath(Node root, int val1, int val2) {
		List<Integer> l1 = getElementPath(root, val1);
		List<Integer> l2 = getElementPath(root, val2);

		if (l1.isEmpty() || l2.isEmpty())
			return -1;
		int j = 0;
		for (j = 0; j < l1.size() && j < l2.size(); j++) {
			// break where first element met
			if (l1.get(j) != l2.get(j))
				break;
		}
		return l1.get(j - 1);
	}

	private List<Integer> getElementPath(Node root, int val) {
		if (root == null)
			return new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		getElementPathHelper(root, val, new Stack<Integer>(), list);
		return list;
	}

	private void getElementPathHelper(Node root, int val, Stack<Integer> path, List<Integer> result) {
		if (root == null)
			return;

		path.push((Integer) root.data);

		getElementPathHelper(root.left, val, path, result);
		getElementPathHelper(root.right, val, path, result);

		if (root.data == val)
			result.addAll(path);

		path.pop();
	}

	public Node findLCA(Node root, int n1, int n2) {
		if (root == null)
			return root;

		// If either n1 or n2 matches with root's key, report
		// the presence by returning root (Note that if a key is
		// ancestor of other, then the ancestor key becomes LCA
		if (root.data == n1 || root.data == n2)
			return root;

		// Look for keys in left and right subtrees
		Node leftSubtree = findLCA(root.left, n1, n2);
		Node rightSubtree = findLCA(root.right, n1, n2);

		// If both of the above calls return Non-NULL, then one key
		// is present in once subtree and other is present in other,
		// So this node is the LCA
		if (leftSubtree != null && rightSubtree != null)
			return root;

		// Otherwise check if left subtree or right subtree is LCA
		return leftSubtree != null ? leftSubtree : rightSubtree;
	}

	/**
	 * Approach 1; Do any DFS traversal and compare String
	 * 
	 * @param tree1
	 * @param tree2
	 * @return
	 */
	public boolean isSubtreeOfTree(Node tree1, Node tree2) {
		String preOrder_tree1 = preOrder(tree1, true);
		String preOrder_tree2 = preOrder(tree2, true);
		return preOrder_tree1.indexOf(preOrder_tree2) >= 0;
	}

	private String preOrder(Node tree, boolean isLeft) {
		if (tree == null) {
			if (isLeft)
				return "lNull";
			else
				return "rNull";
		}
		return "#" + tree.data + preOrder(tree.left, true) + preOrder(tree.right, false);
	}


	/**
	 * Are two Binary trees are same or not check
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public boolean isBTSame(Node n1, Node n2) {
		if (n1 == null && n2 == null)
			return true;
		if (n1 == null || n2 == null)
			return false;

		if (n1.data != n2.data)
			return false;
		return isBTSame(n1.left, n2.left) && isBTSame(n1.right, n2.right);
	}

	/**
	 * Revise me !!
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public boolean isSubTreeOfAnotherTree(Node tree1, Node tree2) {
		if (tree1 == null)
			return false;
		
		boolean leftTree = isBTSame(tree1.left, tree2);
		boolean rightTree = isBTSame(tree1.right, tree2);
		
		return isBTSame(tree1, tree2) || leftTree || rightTree;
	}

	public boolean isBTSameModified(Node n1, Node n2) {
		if (n1 == null && n2 == null)
			return true;
		if (n1 == null || n2 == null)
			return false;
		return (n1.data == n2.data) && isBTSame(n1.left, n2.left) && isBTSame(n1.right, n2.right);
	}

	/**
	 * So find tilt and the sum can be thought in the same prespective.
	 * 
	 */
	int tilt = 0;

	public int tiltOfBinaryTree(Node root) {
		traverse(root);
		return tilt;
	}

	private int traverse(Node root) {
		if (root == null)
			return 0;
		int lh = traverse(root.left);
		int rh = traverse(root.right);

		tilt += Math.abs(lh - rh);
		return lh + rh + root.data;
	}

	public int sumOfBinaryTree(Node root) {
		return traverse(root);
	}

	/**
	 * width and avg of levels are pretty much similar. So I will be doing only
	 * this one.
	 * 
	 * Below solution is wrong need to look into. remove null delimeter as its
	 * seems unnesscerray.
	 * 
	 * @param root
	 * @return
	 */
	public List<Float> avgOfLevels(Node root) {
		List<Float> list = new LinkedList<Float>();

		if (root == null)
			return list;

		int sum = 0, currCount = 0, count = 0, max = 0;
		Float avg = 0.0f;
		Node temp = null;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		// q.add(null);

		while (!q.isEmpty()) {

			currCount = count = q.size() - 1;
			max = Math.max(max, currCount);

			temp = q.peek();
			if (temp == null) {
				temp = q.poll();
				if (q.peek() != null) {
					q.add(null);
				}
			} else {
				while (count-- > 0 && !q.isEmpty()) {
					temp = q.poll();
					sum += temp.data;
					if (temp.left != null)
						q.add(temp.left);
					if (temp.right != null)
						q.add(temp.right);
				}
				avg = (float) (sum / currCount);
				sum = 0;
				list.add(avg);
			}

		} // outer while

		return list;
	}

	/**
	 * Inorder traversal to merge two binary trees
	 * 
	 * @param r1
	 * @param r2
	 * @return
	 */
	public Node merge2BinaryTrees(Node r1, Node r2) {
		if (r1 == null || r2 == null)
			return (r1 == null) ? r2 : r1;
		r1.data += r2.data;

		r1.left = merge2BinaryTrees(r1.left, r2.left);
		r1.right = merge2BinaryTrees(r1.right, r2.right);

		return r1;
	}

	// Function to find the maximum width of
	// the tree using level order traversal
	public int maxwidth(Node root) {
		// Base case
		if (root == null)
			return 0;

		// Initialize result
		int maxwidth = 0;

		// Do Level order traversal keeping
		// track of number of nodes at every level
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {
			// Get the size of queue when the level order
			// traversal for one level finishes
			int count = q.size();

			// Update the maximum node count value
			maxwidth = Math.max(maxwidth, count);

			// Iterate for all the nodes in
			// the queue currently
			while (count-- > 0) {
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
		List<List<Integer>> pathSumList = new ArrayList<List<Integer>>();
		pathSumInner(root, sum, new Stack<Integer>(), pathSumList);
		return pathSumList;
	}

	private void pathSumInner(Node root, int sum, Stack<Integer> path, List<List<Integer>> resultList) {
		if (root == null)
			return;

		path.push((Integer) root.data);

		pathSumInner(root.left, sum - (Integer) root.data, path, resultList);
		pathSumInner(root.right, sum - (Integer) root.data, path, resultList);

		if (root.left == null && root.right == null && sum == (Integer) root.data)
			resultList.add(new ArrayList<Integer>(path));

		path.pop();
	}

	public Integer sumRootToLeafNumbers(Node root) {
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
	public static void main1(String args[]) {
		BinaryTreeLC tree1 = new BinaryTreeLC();
		 tree1.root = tree1.new Node(100);
		 tree1.root.left = tree1.new Node(50);
		 tree1.root.right = tree1.new Node(300);
		 tree1.root.left.left = tree1.new Node(20);
		 tree1.root.left.right = tree1.new Node(70);

		//
		// tree1.root.left.left.left = tree1.new Node(7);
		// tree1.root.left.left.right = tree1.new Node(5);
		// tree1.root.left.left.right.left = tree1.new Node(2);
		//
		// tree1.root.right.left = tree1.new Node(13);
		// tree1.root.right.right = tree1.new Node(4);
		//
		// tree1.root.right.right.right = tree1.new Node(1);

		// BinaryTreeLC tree = new BinaryTreeLC();
		// tree.root = tree.new Node(5);
		// tree.root.left = tree.new Node(4);
		// tree.root.right = tree.new Node(8);
		//
		// tree.root.left.left = tree.new Node(1);
		// tree.root.left.left.left = tree.new Node(7);
		// tree.root.left.left.right = tree.new Node(5);
		// tree.root.left.left.right.left = tree.new Node(2);
		//
		// tree.root.right.left = tree.new Node(13);
		// tree.root.right.right = tree.new Node(4);
		//
		// tree.root.right.right.right = tree.new Node(1);
		//
		// Integer sum = tree.sumRootToLeafNumbers(tree.root);
		// System.out.println(sum);
		BinaryTreeLC tree = new BinaryTreeLC();
		tree.root = tree.new Node(10);
		tree.root.left = tree.new Node(16);
		tree.root.right = tree.new Node(5);
		tree.root.left.left = tree.new Node(0);
		tree.root.left.right = tree.new Node(-3);
		tree.root.right.left = tree.new Node(6);
		tree.root.right.right = tree.new Node(11);

		System.out.println("LCA(4, 3) = " + tree.findLCA_withPath(tree.root, 4, 3));
		System.out.println("LCA(0, 0) = " + tree.findLCA_withPath(tree.root, 4, 0));
		System.out.println("LCA(2, 4) = " + tree.findLCA_withPath(tree.root, 10, 16));
		System.out.println("LCA(-3, 6) = " + tree.findLCA_withPath(tree.root, -3, 6));
		System.out.println("LCA(16, 5) = " + tree.findLCA_withPath(tree.root, 16, 5));
		System.out.println("LCA(0, -3) = " + tree.findLCA_withPath(tree.root, 0, -3));

		BinaryTreeLC bt = new BinaryTreeLC();
		bt.root = bt.new Node(1);
		bt.root.left = bt.new Node(2);
		bt.root.right = bt.new Node(3);
		bt.root.left.left = bt.new Node(13);

		BinaryTreeLC bt2 = new BinaryTreeLC();
		bt2.root = bt2.new Node(1);
		bt2.root.left = bt2.new Node(2);
		bt2.root.right = bt2.new Node(3);
		bt2.root.left.left = bt2.new Node(13);

		System.out.println(bt.isBTSame(bt.root, bt2.root));

		// List<Float> l = tree.avgOfLevels(tree.root);
		// for (Float integer : l) {
		// System.out.println(integer);
		// }
		// Node mergedTree = new BinaryTreeLC().merge2BinaryTrees(tree.root,
		// tree1.root);
		//
		// new BinaryTreeLC().preOrderPrint(mergedTree);
	}

	public void preOrderPrint(Node root) {
		if (root == null)
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
