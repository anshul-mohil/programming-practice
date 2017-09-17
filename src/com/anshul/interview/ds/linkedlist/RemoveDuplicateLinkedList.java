package com.anshul.interview.ds.linkedlist;

public class RemoveDuplicateLinkedList {
	/*
	Node is defined as 
	  class Node {
	     int data;
	     Node next;
	  }
	*/

	Node RemoveDuplicates(Node head) {
	  // This is a "method-only" submission. 
	  // You only need to complete this method. 
	    if(head == null)
	        return null;
	    Node prev = head;
	    Node forw = head.next;
	    while( forw != null){
	        if(prev.data == forw.data){
	            prev.next = forw.next;
	            forw = forw.next;
	        }
	        else{
	     prev = forw;
	     forw = forw.next;
	        }
	    }

	    return head;
	}
}
