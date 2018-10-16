package com.anshul.designpatterns.behavioural.mediator.mediator;

import com.anshul.designpatterns.behavioural.mediator.colleagues.Colleague;

import java.util.LinkedList;
import java.util.List;

public class ChatMediatorImpl<T extends Colleague> implements ChatMediator<T> {

  private final List<T> colleagueList;

  public ChatMediatorImpl(List<T> colleagueList) {
    this.colleagueList = colleagueList;
  }

  public ChatMediatorImpl() {
    colleagueList = new LinkedList<>();
  }

  @Override
  public void sendMessage(T colleague, String msg) {
    for (Colleague colleagueCurr : colleagueList) {
      if (!colleagueCurr.equals(colleague)) {
        colleagueCurr.receiveMessage(colleague, msg);
      }
    }
  }

  @Override
  public void add(T colleague) {
    colleagueList.add(colleague);
  }

  @Override
  public void remove(T colleague) {
    colleagueList.remove(colleague);
  }
}
