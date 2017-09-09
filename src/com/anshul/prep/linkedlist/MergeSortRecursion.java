package com.anshul.prep.linkedlist;

public class MergeSortRecursion {

	private Node mergeTwoLists(Node list1, Node list2) {
		if (list1 == null || list2 == null)
			return list1 == null ? list2 : list1;
		Node mergeHead;
		if (list1.data <= list2.data) {
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

		Node list = new MergeSortRecursion().mergeTwoLists(list1, list2);

		// Displaying merged list
		while (list != null) {
			System.out.print(list.data + " ");
			list = list.next;
		}
	}
}
