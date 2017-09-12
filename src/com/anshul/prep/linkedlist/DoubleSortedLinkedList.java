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
	    
	    // if insertion need to happen at the beginning of the list
	    if(head.data >= data){
	        newNode.next = head;
	        head.prev = newNode;
	        // updating the head to point to new head
	        return newNode;
	    }
	    Node curr = head;
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
	DoubleSortedLinkedList object = new DoubleSortedLinkedList();
	Node newNode = object.sortedInsert(null, 21);
	newNode = object.sortedInsert(newNode, 20);
	newNode = object.sortedInsert(newNode, 32);
	newNode = object.sortedInsert(newNode, 19);
	newNode = object.sortedInsert(newNode, 41);
	newNode = object.sortedInsert(newNode, 1);
	System.out.println(" Hello");
	while(newNode != null) {
		System.out.println(newNode.data + " -- ");
		newNode = newNode.next;
	}
}
}
