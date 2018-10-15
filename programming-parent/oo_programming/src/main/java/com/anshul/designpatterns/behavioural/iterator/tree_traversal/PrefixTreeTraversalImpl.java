package com.anshul.designpatterns.behavioural.iterator.tree_traversal;

import java.util.Stack;

public class PrefixTreeTraversalImpl<T extends Node> {

  Stack<T> stack = new Stack<>();

  void pushAll(T node) {
    while (node != null) {
      stack.push(node);
      node = (T) node.left;
    }
  }

  public TreeIterator iterator() {
    return new BSTIteratory();
  }

  private class BSTIteratory implements TreeIterator {

    @Override
    public boolean hasNext() {
      return !stack.empty();
    }

    @Override
    public Object next() {
      Node node = stack.pop();
      if (node.right != null) {
        pushAll((T) node.right);
      }
      return node;
    }
  }
}