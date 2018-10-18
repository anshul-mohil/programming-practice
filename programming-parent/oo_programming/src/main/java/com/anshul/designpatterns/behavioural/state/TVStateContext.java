package com.anshul.designpatterns.behavioural.state;

public class TVStateContext implements State {

  private State state;

  public TVStateContext(State state) {
    this.state = state;
  }

  public void setSate(State state) {
    this.state = state;
  }

  public State getState() {
    return state;
  }

  @Override
  public void doAction() {
    state.doAction();
  }
}
