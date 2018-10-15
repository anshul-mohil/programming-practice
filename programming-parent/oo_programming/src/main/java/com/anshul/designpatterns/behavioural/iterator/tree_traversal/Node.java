package com.anshul.designpatterns.behavioural.iterator.tree_traversal;

public class Node<T extends Node> {
  int data;
  T left;
  T right;

  public Node(int data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Node{" +
        "data=" + data +
        '}';
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public T getLeft() {
    return left;
  }

  public void setLeft(T left) {
    this.left = left;
  }

  public T getRight() {
    return right;
  }

  public void setRight(T right) {
    this.right = right;
  }
}
