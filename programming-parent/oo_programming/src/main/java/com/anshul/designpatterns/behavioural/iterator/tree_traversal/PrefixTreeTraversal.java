package com.anshul.designpatterns.behavioural.iterator.tree_traversal;

interface TreeIterator<T> {
  boolean hasNext();

  T next();

}
