package com.anshul.designpatterns.behavioural.chain_of_responsibility.atm_machine;

interface DispenseChain<T extends Currency> {
  void dispenseCash(Currency amount);

  default void dispenserHelper(Currency cur, int CURRENCY_NOTES, DispenseChain dispenseChain) {
    int amount = cur.getAmount();
    int remainder = amount;
    if (amount >= CURRENCY_NOTES) {
      int num = amount / CURRENCY_NOTES;
      remainder = amount % CURRENCY_NOTES;
      System.out.println("Dispensing " + num + " " + "$" + CURRENCY_NOTES + " note");
    }
    if (dispenseChain == null) {
      System.out.println("remaining amount " + remainder + "//n cannot be dispense and there is no more smaller dispenser");
      return;
    } else {
      dispenseChain.dispenseCash(new Currency(remainder));
    }
  }
}
