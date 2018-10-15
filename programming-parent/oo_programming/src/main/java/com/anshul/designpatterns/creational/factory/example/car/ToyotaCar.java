package com.anshul.designpatterns.creational.factory.example.car;

public abstract class ToyotaCar {
  private String model;
  private Double price;
  private int wheels;
  private float rpm;

  public ToyotaCar() {
  }

  public ToyotaCar(String model, Double price, int wheels, float rpm) {
    this.model = model;
    this.price = price;
    this.wheels = wheels;
    this.rpm = rpm;
  }

  public ToyotaCar(String model, Double price) {
    this.model = model;
    this.price = price;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public float getRpm() {
    return rpm;
  }

  public void setRpm(float rpm) {
    this.rpm = rpm;
  }

  protected abstract void constructCar();

  public String getModel() {
    return model;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }
}
