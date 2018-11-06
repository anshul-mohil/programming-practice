package com.anshul.designpatterns.structural.flyweight;

/**
 * Flyweight Interface
 */

interface Soldier {

  /**
   * Move Soldier From Old Location to New Location
   * Note that soldier location is extrinsic
   * to the SoldierFlyweight Implementation
   *
   * @param previousLocationX
   * @param previousLocationY
   * @param newLocationX
   * @param newLocationY
   */
  void moveSoldier(int previousLocationX,
                   int previousLocationY, int newLocationX, int newLocationY);
}