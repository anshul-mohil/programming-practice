package com.anshul.designpatterns.behavioural.template;

public class EntryPointTemplate {
  public static void main(String[] args) {
    HouseTemplate houseTemplate = new ConcreateHouse();


    houseTemplate.buildHouse();
  }
}
