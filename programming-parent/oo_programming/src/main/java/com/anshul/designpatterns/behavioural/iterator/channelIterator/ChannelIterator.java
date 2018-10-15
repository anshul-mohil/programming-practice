package com.anshul.designpatterns.behavioural.iterator.channelIterator;

public interface ChannelIterator<T> {
  boolean hasNext();

  T next();
}
