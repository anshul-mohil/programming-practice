package com.anshul.designpatterns.factory.example.car;

public class SUV200ToyotaCar extends ToyotaCar {
  public SUV200ToyotaCar(String model, Double price, int wheels, float rpm) {
    super(model, price, wheels, rpm);
  }

  public SUV200ToyotaCar(String model, Double price) {
    super(model, price);
  }

  public SUV200ToyotaCar() {
  }

  @Override
  protected void constructCar() {
    setPrice(2300.45D);
    setRpm(200);
    setWheels(4);
  }
}
