package com.anshul.designpatterns.behavioural.mediator.colleagues;

public interface Colleague {
  void sendMessage(String msg);

  void receiveMessage(Colleague colleague, String msg);

  String getName();
}
