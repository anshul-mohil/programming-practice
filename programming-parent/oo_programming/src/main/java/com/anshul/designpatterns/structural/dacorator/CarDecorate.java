package com.anshul.designpatterns.structural.dacorator;

/**
 * Decorator responsibility is to have IS-A and HAS-A
 * relation of same type of object and perform duel
 * actions. ie. Final object is of type itself using
 * hierarchy but also it is being modified/decorated
 * using HAS-A (composite object).
 */
public class CarDecorate implements Car {

  // As per design composite object should be protected
  // as all subclasses required to use this object.
  protected final Car car;

  public CarDecorate(Car car) {
    this.car = car;
  }

  @Override
  public void assemble() {
    car.assemble();
    //perform actions after decorating current
    // object using composite object
  }

  @Override
  public void getConfiguration() {
    car.getConfiguration();
    //perform actions after decorating current
    // object using composite object
  }
}
