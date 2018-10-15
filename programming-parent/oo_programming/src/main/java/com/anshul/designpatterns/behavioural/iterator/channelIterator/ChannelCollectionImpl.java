package com.anshul.designpatterns.behavioural.iterator.channelIterator;

import java.util.LinkedList;
import java.util.List;

public class ChannelCollectionImpl implements ChannelCollection {

  private List<Channel> channels = new LinkedList<>();

  @Override
  public void addChannel(Channel channel) {
    channels.add(channel);
  }

  @Override
  public void removeChannel(Channel channel) {
    channels.remove(channel);
  }

  @Override
  public ChannelIterator iterator(ChannelType channelType) {
    return new ChannelTypeIterator<Channel>(channelType, channels);
  }

  private class ChannelTypeIterator<T> implements ChannelIterator<T> {

    private final List<T> channelList;
    private ChannelType channelType;
    // to keep track of next channel of given type in the list
    private int channelPositionIndex;

    public ChannelTypeIterator(ChannelType channelType, List<T> channels) {
      this.channelType = channelType;
      synchronized (channels) {
        channelList = channels;
      }
    }

    @Override
    public boolean hasNext() {

      while (channelPositionIndex < channelList.size()) {
        if (((Channel) channelList.get(channelPositionIndex)).getType().equals(channelType)) {
          return true;
        } else {
          channelPositionIndex++;
        }
      }
      return false;
    }

    @Override
    public T next() {
      return channelList.get(channelPositionIndex++);
    }
  }
}
