package com.anshul.interview.ds;

import java.util.HashSet;

import com.anshul.prep.linkedlist.Node;

public class RemoveDupsFromUnsortedLinkedList {
	/**
	 * Remove duplicate using HashSet on unsorted LinkedList
	 */
	private void removeDuplicates(Node head) {
		if (head == null)
			return;
		HashSet<Integer> hs = new HashSet<Integer>();
		Node curr = head.next, prev = head;
		hs.add((Integer) prev.data);
		while (curr != null) {
			if (hs.contains(curr.data)) {
				prev.next = curr.next;
			} else {
				hs.add((Integer) curr.data);
				prev = prev.next;
			}
			curr = curr.next;
		}
	}
/*
	 Drier program to test above functions 
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

		new RemoveDupsFromUnsortedLinkedList().removeDuplicates(llist.head);

		System.out.println("List after removal of elements");
		llist.printList();
	}*/
	
	   public static void main(String[] args) {
	        LinkedList list = new LinkedList();
	        list.head = new Node<Integer>(10);
	        list.head.next = new Node<Integer>(12);
	        list.head.next.next = new Node<Integer>(11);
	        list.head.next.next.next = new Node<Integer>(11);
	        list.head.next.next.next.next = new Node<Integer>(10);
	        list.head.next.next.next.next.next = new Node<Integer>(11);
	        list.head.next.next.next.next.next.next = new Node<Integer>(10);
	 
	        System.out.println("Linked List before removing duplicates : \n ");
	        list.printList();
	 
	        new RemoveDupsFromUnsortedLinkedList().removeDuplicates(list.head);
	        System.out.println("");
	        System.out.println("Linked List after removing duplicates : \n ");
	        list.printList();
	    }
}
