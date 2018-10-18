package com.anshul.designpatterns.behavioural.state;

public class TVOffState implements State {

  @Override
  public void doAction() {
    System.out.println("TV Switched off");
  }
}
