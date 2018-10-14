package com.anshul.designpatterns.abstractfactory;

public class ComputerFactory {

  public Computer createComputer(ComputerAbstractFactory abstractFactory) {
    return abstractFactory.createComputer();
  }
}
