package com.anshul.designpatterns.structural.dacorator;

public class EntryPointDecorator {

  public static void main(String[] args) {

    Car basicCar = new BasicCar();

    Car carDecorate = new CarDecorate(basicCar);

    Car sportsCarDecorator = new SportsCarDecorator(carDecorate);

    sportsCarDecorator.getConfiguration();

  }
}
