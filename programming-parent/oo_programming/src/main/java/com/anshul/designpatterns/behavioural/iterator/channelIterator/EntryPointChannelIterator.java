package com.anshul.designpatterns.behavioural.iterator.channelIterator;

public class EntryPointChannelIterator {
  public static void main(String[] args) {
    ChannelCollection c = new ChannelCollectionImpl();
    c.addChannel(new Channel(70, ChannelType.ENGLISH, "HBO"));
    c.addChannel(new Channel(75, ChannelType.ENGLISH, "DISCOVERY"));
    c.addChannel(new Channel(80, ChannelType.HINDI, "SUB TV"));
    c.addChannel(new Channel(85, ChannelType.HINDI, "SONY"));
    c.addChannel(new Channel(90, ChannelType.HINDI, "Aaj Tak"));

    ChannelIterator hindiIterator = c.iterator(ChannelType.HINDI);
    while (hindiIterator.hasNext()) {
      System.out.println(hindiIterator.next().toString());
    }


    ChannelIterator englishIterator = c.iterator(ChannelType.ENGLISH);
    while (englishIterator.hasNext()) {
      System.out.println(englishIterator.next().toString());
    }

  }
}
