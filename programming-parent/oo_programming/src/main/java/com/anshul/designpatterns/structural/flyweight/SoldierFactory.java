package com.anshul.designpatterns.structural.flyweight;

public class SoldierFactory {

  /**
   * Pool for one soldier only
   * if there are more soldier types
   * this can be an array or list or better a HashMap
   */
  private static Soldier SOLDIER;

  private static Soldier soldier;

  /**
   * return flyweight object
   *
   * @return
   */
  public static Soldier getSoldier() {
    if (soldier == null) {
      synchronized (soldier) {
        if (soldier == null) {
          soldier = new SoldierImpl();
        }
      }
    }
    return soldier;
  }
}
