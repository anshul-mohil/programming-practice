package com.anshul.designpatterns.creational.factory.example.car;

public class ToyotaCarFactory {

  public static ToyotaCar getToyotaCarOf(CarType carType) {
    ToyotaCar car = null;
    switch (carType) {
      case SUV200TOYOTACAR:
        car = new SUV200ToyotaCar();
        break;
      case M22SEDANTOYOTACAR:
        car = new M22SedanToyotaCar();
        break;
      default:
    }
    return car;
  }

}
