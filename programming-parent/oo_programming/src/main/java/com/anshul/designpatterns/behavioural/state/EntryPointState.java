package com.anshul.designpatterns.behavioural.state;

public class EntryPointState {
  public static void main(String[] args) {

    TVOffState tvOffState = new TVOffState();
    TVOnState tvOnState = new TVOnState();

    //context is doing action based on passed state.. so that
    // in future there will be any addition we don't need to
    // change existing class (OpenClose principle) to compensate
    // new type of state. State can be provided at runtime.
    TVStateContext offStateContext = new TVStateContext(tvOffState);
    offStateContext.doAction();


    TVStateContext onStateContext = new TVStateContext(tvOnState);
    onStateContext.doAction();


  }
}
