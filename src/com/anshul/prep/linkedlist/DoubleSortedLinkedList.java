package com.anshul.prep.linkedlist;

public class DoubleSortedLinkedList {
	 class Node {
	     int data;
	     Node next;
	     Node prev;
	  }
	/*
	  Insert Node at the end of a linked list 
	  head pointer input could be NULL as well for empty list
	  Node is defined as 
	  class Node {
	     int data;
	     Node next;
	     Node prev;
	  }
	*/
	// it might have 4 scenarios
	// 1. head == null
	// 2. insert at the start (replace head pointer)
	// 3. insert at the end (after while ends)
	// 4. insert at the min (common scenario)
	Node sortedInsert(Node head,int data) {
		Node newNode =  new Node();
	    newNode.data = data;
	    
	    if(head == null)
	      return newNode;
	    
	    Node curr = head;
	    // if insertion need to happen at the beginning of the list
	    if(curr.data >= data){
	        newNode.next = curr;
	        curr.prev = newNode;
	        // TODO: REMOVE not required
	        newNode.prev = null;
	        
	        // updating the head to point to new head
	        head = newNode;
	        return head;
	    }

	    while(curr.next != null){
	        // if insert location found
	        if(curr.data >= data){
	            newNode.prev = curr.prev;
	            newNode.next = curr;
	            curr.prev = newNode;
	            return head;
	        }
	        curr = curr.next;
	    }
	    // if control reaches here that means
	    // we did not found any location in the LL
	    // to insert this node so insert at the end
	    curr.next = newNode;
	    newNode.prev = curr;
	    return head;
	}
public static void main(String[] args) {
	DoubleSortedLinkedList obj = new DoubleSortedLinkedList();
	Node newNode = obj.sortedInsert(null, 21);
	obj.sortedInsert(newNode, 20);
//	obj.sortedInsert(n, 32);
//	obj.sortedInsert(n, 19);
//	obj.sortedInsert(n, 41);
	
}
}
