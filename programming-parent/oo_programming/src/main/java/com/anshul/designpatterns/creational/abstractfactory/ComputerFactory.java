package com.anshul.designpatterns.creational.abstractfactory;

public class ComputerFactory {

  public Computer createComputer(ComputerAbstractFactory abstractFactory) {
    return abstractFactory.createComputer();
  }
}
