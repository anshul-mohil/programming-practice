package com.anshul.designpatterns.creational.abstractfactory;

public class EntryPointAbstractFactoryDesingPattern {
  public static void main(String[] args) {

    // Factory I would like to use to create specific type of computer
    ServerAbstractFactory serverAbstractFactory = new ServerAbstractFactory();

    // Factory class expect passing of abstract factory to create specific object.
    ComputerFactory computerFactory = new ComputerFactory();
    Computer computer = computerFactory.createComputer(serverAbstractFactory);

    System.out.println(computer.getConfigurations());


  }
}
