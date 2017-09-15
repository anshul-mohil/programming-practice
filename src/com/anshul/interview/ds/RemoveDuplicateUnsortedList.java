package com.anshul.interview.ds;

import com.anshul.prep.linkedlist.Node;

public class RemoveDuplicateUnsortedList {

	private void removeDuplicates(Node head) {
		// TODO Auto-generated method stub
		if (head == null)
			return;
		Node curr = head, nextNode = head.next;

		while (nextNode != null) {
			if (curr.data == nextNode.data) {
				curr.next = nextNode.next;
			} else {
				/**
				 * just to create merge conflict
				 */
				Node temp= new Node(10);
				curr = curr.next;
			}
			nextNode = nextNode.next;
		}
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		LinkedList llist = new LinkedList();
		llist.push(20);
		llist.push(13);
		llist.push(13);
		llist.push(11);
		llist.push(11);
		llist.push(11);

		System.out.println("List before removal of duplicates");
		llist.printList();
		
		new RemoveDuplicateUnsortedList().removeDuplicates(llist.head);

		System.out.println("List after removal of elements");
		llist.printList();
	}
}
