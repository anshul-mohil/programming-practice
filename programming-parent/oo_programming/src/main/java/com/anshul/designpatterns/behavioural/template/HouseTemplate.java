package com.anshul.designpatterns.behavioural.template;

public abstract class HouseTemplate {

  /**
   * Template method define sequence of calling as final
   * and provide few of common implementation(iff needed)s
   */
  public final void buildHouse() {
    buildFoundation();
    buildWalls();
    buildWindows();
    buildTop();
  }

  public void buildFoundation() {
    System.out.println("concrete foundation");
  }

  public abstract void buildWalls();

  public abstract void buildTop();

  public abstract void buildWindows();
}
