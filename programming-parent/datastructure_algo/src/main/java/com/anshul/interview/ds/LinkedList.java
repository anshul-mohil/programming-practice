package com.anshul.interview.ds;

import com.anshul.interview.ds.linkedlist.Node;

public class LinkedList<T> {

  public Node head;

	// A simple and tail recursive function to reverse
	// a linked list. prev is passed as NULL initially.
	public void reverseUtil(Node curr, Node prev) {

		/* If last node mark it head */
		if (curr.next == null) {
			head = curr;

			/* Update next to prev node */
			curr.next = prev;
			return;
		}

		/* Save curr->next node for recursive call */
		Node next1 = curr.next;

		/* and update next .. */
		curr.next = prev;

		reverseUtil(next1, curr);
	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	public void push(T new_data) {
		/*
		 * 1 & 2: Allocate the Node & Put in the data
		 */
		Node<T> new_node = new Node<T>(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/* Function to print linked list */
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
//usage of linkedlist

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.head = new Node<Integer>(1);
		list.head.next = new Node<Integer>(2);
		list.head.next.next = new Node<Integer>(3);
		list.head.next.next.next = new Node<Integer>(4);
		list.head.next.next.next.next = new Node<Integer>(5);
		list.head.next.next.next.next.next = new Node<Integer>(6);
		list.head.next.next.next.next.next.next = new Node<Integer>(7);
		list.head.next.next.next.next.next.next.next = new Node<Integer>(8);

		System.out.println("Original Linked list ");
		list.printList();
		// Node res = list.reverseUtil(head, null);
      list.reverseUtil(new LinkedList<String>().head, null);
		System.out.println("");
		System.out.println("");
		System.out.println("Reversed linked list ");
		// list.printList(res);
		list.printList();
	}
}
