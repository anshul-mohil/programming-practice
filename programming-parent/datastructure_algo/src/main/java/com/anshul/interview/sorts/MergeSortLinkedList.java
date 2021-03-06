package com.anshul.interview.sorts;

public class MergeSortLinkedList {

	Node head = null;

	// node a,b;
	public static class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
	}

	public Node sortedMerge(Node a, Node b) {
		Node result = null;
		/* Base cases */
		if (a == null)
			return b;
		if (b == null)
			return a;

		/* Pick either a or b, and recur */
		if (a.val <= b.val) {
			result = a;
			result.next = sortedMerge(a.next, b);
		} else {
			result = b;
			result.next = sortedMerge(a, b.next);
		}
		return result;

	}

	private Node mergeSort(Node h) {
		// Base case : if head is null
		if (h == null || h.next == null) {
			return h;
		}

		// get the middle of the list
		Node middle = getMiddle(h);
		Node nextofmiddle = middle.next;

		// set the next of middle node to null
		middle.next = null;

		// Apply mergeSort on left list
		Node left = mergeSort(h);

		// Apply mergeSort on right list
		Node right = mergeSort(nextofmiddle);

		// Merge the left and right lists
		Node sortedlist = sortedMerge(left, right);
		return sortedlist;
	}

	// Utility function to get the middle of the linked list
	public Node getMiddle(Node h) {
		// Base case
		if (h == null)
			return h;
		
		 Node fastptr = h.next, slowptr = h;
		 while(fastptr != null && fastptr.next != null)
		 {
		 fastptr = fastptr.next.next;
		 slowptr = slowptr.next;
		 }
		return slowptr;
	}

	void push(int new_data) {
		/* allocate node */
		Node new_node = new Node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Utility function to print the linked list
	void printList(Node headref) {
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args) {

		MergeSortLinkedList li = new MergeSortLinkedList();
		/*
		 * Let us create a unsorted linked lists to test the functions Created
		 * lists shall be a: 2->3->20->5->10->15
		 */
		li.push(15);
		li.push(10);
		li.push(5);
		li.push(20);
		li.push(3);
		li.push(2);
		System.out.println("Linked List without sorting is :");
		li.printList(li.head);

		// Apply merge Sort
		li.head = li.mergeSort(li.head);
		System.out.print("\n Sorted Linked List is: \n");
		li.printList(li.head);
	}
}
