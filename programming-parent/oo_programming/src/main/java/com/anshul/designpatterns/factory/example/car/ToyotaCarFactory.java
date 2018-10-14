package com.anshul.designpatterns.factory.example.car;

public class ToyotaCarFactory {

  public static ToyotaCar getToyotaCarOf(String carType) {
    carType = carType.toLowerCase();
    ToyotaCar car = null;
    switch (carType) {
      case "suv200toyotacar":
        car = new SUV200ToyotaCar();

      case "m22sedantoyotacar":
        car = new M22SedanToyotaCar();
        break;
      default:
    }
    return car;
  }
}
