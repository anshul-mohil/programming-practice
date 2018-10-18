package com.anshul.designpatterns.structural.flyweight;

public class SoldierImpl implements Soldier {

  /**
   * Intrinsic State maintained by flyweight implementation
   * Solider Shape ( graphical representation)
   * how to display the soldier is up to the flyweight implementation
   */
  private Object soldierGraphicalRepresentation;

  /**
   * Note that this method accepts soldier location
   * Soldier Location is Extrinsic and no reference to previous location
   * or new location is maintained inside the flyweight implementation
   */
  @Override
  public void moveSoldier(int previousLocationX, int previousLocationY, int newLocationX, int newLocationY) {
    // delete soldier graphic from previous location and generate at new location.
  }
}
