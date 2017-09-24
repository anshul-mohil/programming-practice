package com.anshul.interview.ds.linkedlist;

//import 
public class DoubleSortedLinkedList {

	// it might have 4 scenarios
	// 1. head == null
	// 2. insert at the start (replace head pointer)
	// 3. insert at the end (after while ends)
	// 4. insert at the min (common scenario)
	public Node sortedInsert(Node head, int data) {

		Node newNode = new Node(data);
		if (head == null)
			return newNode;

		// if insertion need to happen at the beginning of the list
		if ((int) head.data > data) {
			newNode.next = head;
			head.prev = newNode;
			return newNode;
		}
		Node curr = head.next;
		Node prev = head;
		while (curr != null) {
			if((int)curr.data > data) {
				//then insert item
				newNode.prev = curr.prev;
				newNode.next = curr;
				prev.next = newNode;
				curr.prev = newNode;
				return head;
			}
			prev = curr;
			curr = curr.next;
			
		}
		// if there is no place to insert and curr become null
		prev.next = newNode;
		newNode.prev = prev;
		return head;
	
}
}
//	// if insert location found
//				if ((int) curr.data > data) {
//					newNode.prev = curr.prev;
//					newNode.next = curr;
//					curr.prev = newNode;
//					return head;
//				}
//				curr = curr.next;
//			}
//			/*
//			 * Found bug through Junit testing
//			 */
//			Node prev = curr;
//			if((int)curr.data > data) {
//			
//			}
//			else {
//				//insert at the end
//				curr.next = newNode;
//				newNode.prev = curr;
//			}
