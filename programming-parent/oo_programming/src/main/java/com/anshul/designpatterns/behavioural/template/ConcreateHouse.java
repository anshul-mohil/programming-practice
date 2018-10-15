package com.anshul.designpatterns.behavioural.template;

public class ConcreateHouse extends HouseTemplate {
  @Override
  public void buildWalls() {
    System.out.println("concrete walls");
  }

  @Override
  public void buildTop() {
    System.out.println("concrete top");
  }

  @Override
  public void buildWindows() {
    System.out.println("wooden windows");
  }
}
