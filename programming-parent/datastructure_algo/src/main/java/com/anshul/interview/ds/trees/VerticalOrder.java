package com.anshul.interview.ds.trees;

import java.util.*;
/**
 * 
 * @author Tushar Roy
 *
 */
public class VerticalOrder {
	
	private  Node root;
	
	public List<List<Integer>> verticalOrder(Node root) {
		if (root == null) {
			return new ArrayList<>();
		}
		int minVal = 0;
		int maxVal = 0;
		Map<Integer, List<Integer>> map = new HashMap<>();

		Deque<Node> queue = new LinkedList<>();
		Deque<Integer> verticalQueue = new LinkedList<>();

		queue.offerFirst(root);
		verticalQueue.offerFirst(0);
		int vertical;
		while (!queue.isEmpty()) {
			root = queue.pollFirst();
			vertical = verticalQueue.pollFirst();
			minVal = Math.min(minVal, vertical);
			maxVal = Math.max(maxVal, vertical);

			List<Integer> r = map.get(vertical);
			if (r == null) {
				r = new ArrayList<>();
				map.put(vertical, r);
			}
			r.add(root.data);

			if (root.left != null) {
				queue.offerLast(root.left);
				verticalQueue.offerLast(vertical - 1);
			}

			if (root.right != null) {
				queue.offerLast(root.right);
				verticalQueue.offerLast(vertical + 1);
			}
		}

		List<List<Integer>> result = new ArrayList<>();
		for (int i = minVal; i <= maxVal; i++) {
			List<Integer> r = map.get(i);
			result.add(r);
		}
		return result;
	}
	// A binary tree node
	class Node {
		int data;
		Node left, right;

		Node(int item) {
			data = item;
			left = right = null;
		}
	}

	// Driver program to test the above functions
	public static void main(String args[]) {
		VerticalOrder vc = new VerticalOrder();
		/* Let us construct the tree shown in above diagram */
		vc.root = new VerticalOrder().new Node(1);
		vc.root.left = new VerticalOrder().new Node(2);
		vc.root.right = new VerticalOrder().new Node(3);
		vc.root.left.left = new VerticalOrder().new  Node(4);
		vc.root.left.right = new VerticalOrder().new Node(5);
		vc.root.right.left = new VerticalOrder().new Node(6);
		vc.root.right.right = new VerticalOrder().new Node(7);
		vc.root.right.left.right =new VerticalOrder().new Node(8);
		vc.root.right.right.right = new VerticalOrder().new Node(9);

		System.out.println("vertical order traversal is :");
		List<List<Integer>> list = vc.verticalOrder(vc.root);
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			List<Integer> list2 = (List<Integer>) iterator.next();
			for (Iterator iterator2 = list2.iterator(); iterator2.hasNext();) {
				Integer integer = (Integer) iterator2.next();
				System.out.print(integer +" ");
			}
			System.out.println();
		}
		
	}
}
