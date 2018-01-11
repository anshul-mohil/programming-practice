package com.anshul.interview.stack_queue;

import java.util.EmptyStackException;

public class StackLinkeList<T> {
 class Node{
	 T data;
	 Node next;
	 Node(T d){ data = d;}
 }
 Node top;
 
 
 public void push(T val){
	 Node temp = this.top;
	 this.top = new Node(val);
	 this.top.next = temp;
 }
 public T peek(){
	 if(isEmpty())
		 return null;
	 return this.top.data;
 }
 public boolean isEmpty(){
	 return top == null;
 }
 public T poll(){
	 if(isEmpty())
		 throw new EmptyStackException();
	 Node temp = this.top.next;
	 T data = top.data;
	 this.top = temp;
	 return data;
 }
	public static void main(String[] args) {
		StackLinkeList<Integer> stack = new StackLinkeList<Integer>();
	//	stack.poll();
		stack.push(Integer.valueOf(10));
		System.out.println(stack.peek());
		stack.push(Integer.valueOf(20));
		System.out.println(stack.peek());
		stack.push(Integer.valueOf(30));
		System.out.println(stack.peek());
		System.out.println("Start Polling");
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
			stack.push(40);
			System.out.println(stack.peek());
			System.out.println(stack.poll());
	}
}
