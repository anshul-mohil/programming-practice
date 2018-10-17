package com.anshul.designpatterns.structural.dacorator;

public class SportsCarDecorator extends CarDecorate {

  public SportsCarDecorator(Car car) {
    super(car);
  }

  @Override
  public void assemble() {
    super.assemble();
    System.out.println(" Sports car decorator");
    System.out.println("Adding sports car features");
  }

  @Override
  public void getConfiguration() {
    super.getConfiguration();
    System.out.println(" Sports car decorator");
    System.out.println("Adding Music player, sun roof and alloy wheels");
  }
}
