package com.anshul.designpatterns.behavioural.chain_of_responsibility.atm_machine;

public class Currency {
  private int amount;

  public Currency(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "Currency{" +
        "amount=" + amount +
        '}';
  }
}
