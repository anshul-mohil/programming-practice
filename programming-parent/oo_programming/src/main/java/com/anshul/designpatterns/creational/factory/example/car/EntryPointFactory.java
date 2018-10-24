package com.anshul.designpatterns.creational.factory.example.car;

public class EntryPointFactory {
  public static void main(String[] args) {
    ToyotaCar suv200ToyotaCar = ToyotaCarFactory.getToyotaCarOf(CarType.SUV200TOYOTACAR);

    suv200ToyotaCar.setPrice(100.00D);
    suv200ToyotaCar.setRpm(120.7f);
    suv200ToyotaCar.setWheels(4);
    System.out.println(suv200ToyotaCar.getRpm());
    System.out.println(suv200ToyotaCar.getWheels());

  }
}
