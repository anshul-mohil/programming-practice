package com.anshul.interview.stack_queue;

import java.util.EmptyStackException;

public class StackImpl {

	private Integer[] obj;
	// max index represent the max index can be componsated in this stack 
	private int maxIndex;
	private int top = -1;
	
	public StackImpl(int size) {
		this.obj = new Integer[size];
		maxIndex = size-1;
	}
	
	public boolean isEmpty(){
		return top == -1;		
	}
	public Integer peek(){
		if(isEmpty())
			return null;
		return obj[top];
	}
	public boolean isFull(){
		return top == maxIndex;
	}
	public Integer poll(){
		if(isEmpty())
			throw new EmptyStackException();
		return obj[top--];
	}
	public void push(Integer value){
		if(isFull())
			throw new StackOverflowError();
		obj[++top] = value;
	}
	public static void main(String[] args) {
		StackImpl stack = new StackImpl(3);
	//	stack.poll();
		stack.push(10);
		System.out.println(stack.peek());
		stack.push(20);
		System.out.println(stack.peek());
		stack.push(30);
		System.out.println(stack.peek());
		System.out.println("Start Polling");
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		System.out.println(stack.poll());
		System.out.println(stack.peek());
		System.out.println(stack.poll());
	//	System.out.println(stack.peek());
		//	stack.push(40);
	}
}
