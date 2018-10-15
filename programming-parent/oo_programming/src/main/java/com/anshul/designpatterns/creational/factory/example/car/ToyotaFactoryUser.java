package com.anshul.designpatterns.creational.factory.example.car;

public class ToyotaFactoryUser {
  public static void main(String[] args) {
    ToyotaCar suv200toyotacar = ToyotaCarFactory.getToyotaCarOf("suv200toyotacar");

    System.out.println(suv200toyotacar.getModel());
    System.out.println(suv200toyotacar.getPrice());

  }
}
