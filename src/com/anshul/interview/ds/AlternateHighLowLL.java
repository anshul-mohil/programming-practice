package com.anshul.interview.ds;

import com.anshul.interview.ds.linkedlist.Node;

public class AlternateHighLowLL {

	public Node getAlternateHighLowList(Node head){
		
		if(head == null || head.next == null) {
			return head;
		}
		Node prev = head;
		Node curr = head.next;
		
		while(curr != null) {
			//stage 1
			//check low high between prev and curr
			if( (int)prev.data < (int)curr.data ) {
				//do swap
				int temp = (int) curr.data;
				curr.data = prev.data;
				prev.data = temp;
			}
			//state 2
			Node next = curr.next;
			// compare curr with next and swap if nessary
			if(next != null) {
				if((int)curr.data > (int)next.data) {				
					//swap values
					int temp = (int) curr.data;
					curr.data = next.data;
					next.data = temp;
				}
				//increment to the next set of values
				prev = next;
				curr = next.next;
			}
			else {
				// no element left to comapre and swap
				break;
			}
		}
		return head;
		
	}

	/* Drier program to test above functions */
	public static void main(String args[]) {
		LinkedList<Integer> llist = new LinkedList<Integer>();
		llist.push(1);
		llist.push(2);
		llist.push(3);
		llist.push(4);
		llist.push(5);
		llist.push(6);

		System.out.println("original list");
		llist.printList();
		
		Node newHead = new AlternateHighLowLL().getAlternateHighLowList(llist.head);

		System.out.println("List after alternating list of elements");
		llist.printList(newHead);
	}
}

