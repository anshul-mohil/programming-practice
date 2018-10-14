package com.anshul.designpatterns.abstractfactory;

public class ServerAbstractFactory implements ComputerAbstractFactory {
  @Override
  public Computer createComputer() {
    return new Server(16, "intel i5", 300, "Server290");
  }
}
