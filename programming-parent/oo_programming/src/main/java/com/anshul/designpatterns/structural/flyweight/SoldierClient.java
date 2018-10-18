package com.anshul.designpatterns.structural.flyweight;

/**
 * This is the "Heavyweight" soldier object
 * which is the client of the flyweight soldier
 * this object provides all soldier services and is used in the game
 */
public class SoldierClient {
  private Soldier soldier = SoldierFactory.getSoldier();

  /**
   * extrinsic properties of soldier which Soldier implementation
   * will help stream outwards.
   */
  private int currentLocationX = 0;
  private int currentLocationY = 0;

  /**
   * @param newLocationX
   * @param newLocationY
   */
  public void moveSoldierFrom(int newLocationX, int newLocationY) {

    // here the actual rendering is handled by the flyweight object
    soldier.moveSoldier(currentLocationX, currentLocationY, newLocationX, newLocationY);

    // this object is responsible for maintaining the state
    // that is extrinsic to the flyweight
    this.currentLocationX = newLocationX;
    this.currentLocationY = newLocationY;
  }
}
