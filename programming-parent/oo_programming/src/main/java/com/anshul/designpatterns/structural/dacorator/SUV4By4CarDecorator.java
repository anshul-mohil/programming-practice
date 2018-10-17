package com.anshul.designpatterns.structural.dacorator;

public class SUV4By4CarDecorator extends CarDecorate {

  public SUV4By4CarDecorator(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println(" SUV car decorator");
    System.out.println(" Adding power to all engines and increasing horse power to 4000cc");
  }

  @Override
  public void getConfiguration() {
    super.getConfiguration();
    System.out.println(" SUV car decorator");
    System.out.println("Adding Rig bumper support and off road tyres");
  }
}

