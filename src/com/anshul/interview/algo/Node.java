package com.anshul.interview.algo;

//Java program to print all the node to leaf path

/* A binary tree node has data, pointer to left child
and a pointer to right child */
public class Node 
{
 public int data;
 public Node left, right;

 public Node(int item) 
 {
     data = item;
     left = right = null;
 }
}
