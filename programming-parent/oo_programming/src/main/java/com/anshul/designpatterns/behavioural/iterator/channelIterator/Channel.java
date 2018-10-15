package com.anshul.designpatterns.behavioural.iterator.channelIterator;

public class Channel {
  private double frequency;
  private ChannelType type;
  private String name;

  public Channel(double frequency, ChannelType type, String name) {
    this.frequency = frequency;
    this.type = type;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Channel{" +
        "frequency=" + frequency +
        ", type=" + type +
        '}';
  }

  public double getFrequency() {
    return frequency;
  }

  public void setFrequency(double frequency) {
    this.frequency = frequency;
  }

  public ChannelType getType() {
    return type;
  }

  public void setType(ChannelType type) {
    this.type = type;
  }
}
