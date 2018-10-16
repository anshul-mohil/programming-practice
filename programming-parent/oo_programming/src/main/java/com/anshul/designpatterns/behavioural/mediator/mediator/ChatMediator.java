package com.anshul.designpatterns.behavioural.mediator.mediator;

import com.anshul.designpatterns.behavioural.mediator.colleagues.Colleague;

public interface ChatMediator<T extends Colleague> {
  void sendMessage(T colleague, String msg);

  void add(T colleague);

  void remove(T colleague);
}
