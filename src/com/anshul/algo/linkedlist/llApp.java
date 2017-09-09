package com.anshul.algo.linkedlist;


import java.util.HashSet;

import com.anshul.algo.linkedlist.LinkedList1.Node;
/**
 *  
 * @author Explorer
 *
 * @param <T>
 */
class LinkedList1<T>{
	//todo: add comment
	Node<T> head = null;
	public void add(T value){
		Node<T> newNode = new Node<T>(value);
		if(head == null)
			head = newNode;
		else{
		Node temp	= head;
		head = newNode;
		head.next = temp;
		}
	}

	class Node<T>{
		T data;
		Node<T> next;
		Node(T value){
			data = value;
		}
		public void display(){
			System.out.println(data + " ");
		}
	}
	
}
public class llApp{
	public static void main(String[] args) {
		LinkedList1<Integer> ll = new LinkedList1();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(20);
		ll.add(10);
		Node curr = ll.head;
		while(curr != null){
			System.out.println(curr.data);
			curr = curr.next;
		}	
		// testing for only 1 element;
		//ll.head.next = null;
		removeDuplicates(ll);
		curr = ll.head;
		while(curr != null){
			System.out.println(curr.data + " -- ");
			curr = curr.next;
		}
		
		
		LinkedList1<Integer> ll1 = new LinkedList1();
		ll1.add(10);
		ll1.add(20);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(40);
		Node curr2 = ll1.head;
		while(curr2 != null){
			System.out.println(curr2.data + " sorted");
			curr2 = curr.next;
		}
		removeDupsFromSortedLinkedList(ll1);
	}

	private static void removeDupsFromSortedLinkedList(LinkedList1<Integer> ll1) {
		// TODO Auto-generated method stub
		
	}

	private static void removeDuplicates(LinkedList1<Integer> ll) {
		HashSet hs = new HashSet();
		// if linkedlist is null or having only 1 element there is no 
		// purpose to search for the duplicate element
		if(ll == null || ll.head == null)
			return;
		Node parent = ll.head;
		Node curr = parent.next;
		hs.add(parent.data);
		while(curr != null){
			// data already exist
			if( !(hs.add(curr.data))){
				// removing node
				parent.next = curr.next;
				curr = parent.next;
			}
			else{
				parent = curr;
				curr = curr.next;
			}
		}
	}
}















