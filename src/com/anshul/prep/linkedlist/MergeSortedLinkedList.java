package com.anshul.prep.linkedlist;

class Node {

	int data;
	Node next;

	Node(int data) {
		this.data = data;
	}
}

public class MergeSortedLinkedList {

	public Node mergeLists(Node a, Node b) {

		// creating a dummy node, helps to create starting point
		Node dummy = new Node(0);
		// tail keep track of new created linkedlist
		Node tail = dummy;
		while (true) {
			if (a == null) {
				tail.next = b;
				break;
			} else if (b == null) {
				tail.next = a;
				break;
			}
			Node nNode = new Node(0);
			// sending the linked list to move
			// move function will just move forward and push it end of the tail
			if (a.data <= b.data) {
				// creating new node and appending
				nNode.data = a.data;
				tail.next = nNode;
				a = a.next;
			} else {
				// creating new node and appending
				nNode.data = b.data;
				tail.next = nNode;
				b = b.next;
			}
			tail = tail.next;
		}//end of while
		return (dummy.next);
	}
// Test invocation method
	public static void main(String[] args) {
		Node list1 = new Node(1);
		list1.next = new Node(8);
		list1.next.next = new Node(11);
		list1.next.next.next = new Node(13);
		list1.next.next.next.next = new Node(14);
		list1.next.next.next.next.next = new Node(19);
		list1.next.next.next.next.next.next = new Node(26);
		list1.next.next.next.next.next.next.next = new Node(27);
		list1.next.next.next.next.next.next.next.next = new Node(28);
		
		Node list2 = new Node(10);
		list2.next = new Node(12);
		list2.next.next = new Node(21);
		list2.next.next.next = new Node(23);
		list2.next.next.next.next = new Node(24);
		
		Node list = new MergeSortedLinkedList().mergeLists(list1, list2);
		
		//Node list = new MergeSortedLinkedList().mergeLists(null, null);
		//Node list = new MergeSortedLinkedList().mergeLists(null, list2);
		while(list != null){
			System.out.print(list.data + " ");
			list = list.next;
		}
	}
}
