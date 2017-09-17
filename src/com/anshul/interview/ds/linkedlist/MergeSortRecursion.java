package com.anshul.interview.ds.linkedlist;

public class MergeSortRecursion {

	private Node mergeTwoLists(Node list1, Node list2) {
		if (list1 == null || list2 == null)
			return list1 == null ? list2 : list1;
		Node mergeHead;
		if ((int)list1.data <= (int)list2.data) {
			mergeHead = list1;
			mergeHead.next = mergeTwoLists(list1.next, list2);
		} else {
			mergeHead = list2;
			mergeHead.next = mergeTwoLists(list1, list2.next);
		}
		return mergeHead;
	}
	

	// Test invocation method
	public static void main(String[] args) {
		Node list1 = new Node<Integer>(1);
		list1.next = new Node<Integer>(8);
		list1.next.next = new Node<Integer>(11);
		list1.next.next.next = new Node<Integer>(13);
		list1.next.next.next.next = new Node<Integer>(14);
		list1.next.next.next.next.next = new Node<Integer>(19);
		list1.next.next.next.next.next.next = new Node<Integer>(26);
		list1.next.next.next.next.next.next.next = new Node<Integer>(27);
		list1.next.next.next.next.next.next.next.next = new Node<Integer>(28);

		Node list2 = new Node<Integer>(10);
		list2.next = new Node<Integer>(12);
		list2.next.next = new Node<Integer>(21);
		list2.next.next.next = new Node<Integer>(23);
		list2.next.next.next.next = new Node<Integer>(24);

		Node list = new MergeSortRecursion().mergeTwoLists(list1, list2);

		// Displaying merged list
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
	}
}
