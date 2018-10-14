package com.anshul.designpatterns.abstractfactory;

public class PCAbstractFactory implements ComputerAbstractFactory {

  @Override
  public Computer createComputer() {
    return new PC(8, "intel i3", 200, "Sony Vaio");
  }
}
