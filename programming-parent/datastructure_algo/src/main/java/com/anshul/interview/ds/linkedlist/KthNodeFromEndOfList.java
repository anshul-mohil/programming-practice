package com.anshul.interview.ds.linkedlist;

public class KthNodeFromEndOfList {
	@SuppressWarnings("unchecked")
	public Node<Integer> kthNodeFromEnd(Node<Integer> head, int indexToGet) {
		Node<Integer> tailPointer = head;
		Node<Integer> secPointer = head;
		int kthNode = indexToGet;
		if (head == null)
			return null;
		while (kthNode-- != 0 && tailPointer != null) {
			tailPointer = tailPointer.next;
		}
		if (tailPointer == null)
			return null;
		while (tailPointer != null) {
			tailPointer = tailPointer.next;
			secPointer = secPointer.next;
		}
		return secPointer;
	}

}
