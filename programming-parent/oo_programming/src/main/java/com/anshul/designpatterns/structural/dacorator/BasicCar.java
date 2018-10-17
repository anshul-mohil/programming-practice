package com.anshul.designpatterns.structural.dacorator;

public class BasicCar implements Car {

  @Override
  public void assemble() {
    System.out.println("BasicCar");
    System.out.println(" Adding basic components of car");
  }

  @Override
  public void getConfiguration() {
    System.out.println("BasicCar");
    System.out.println(" Have engine, Wheel, Body, Basic accessories ");
  }

}
