package com.anshul.designpatterns.behavioural.state;

public class TVOnState implements State {

  @Override
  public void doAction() {
    System.out.println("Tv Switch on");
  }
}
