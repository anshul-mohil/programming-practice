package com.anshul.designpatterns.creational.factory.example.car;

public class M22SedanToyotaCar extends ToyotaCar {
  public M22SedanToyotaCar(String model, Double price, int wheels, float rpm) {
    super(model, price, wheels, rpm);
  }

  public M22SedanToyotaCar(String model, Double price) {
    super(model, price);
  }

  public M22SedanToyotaCar() {
  }

  @Override
  protected void constructCar() {
    setWheels(6);
    setPrice(1000.32D);
    setRpm(120);
  }
}
