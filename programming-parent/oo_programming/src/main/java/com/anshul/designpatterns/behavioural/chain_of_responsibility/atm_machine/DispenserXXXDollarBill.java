package com.anshul.designpatterns.behavioural.chain_of_responsibility.atm_machine;

/**
 * Chain of command have problem of repeated code..
 * Which has been solved here using default handler based on
 * dynamic dispenser in chain.
 */
public class DispenserXXXDollarBill implements DispenseChain {

  private final DispenseChain dispenseChain;
  private final int CURRENCY_NOTES;

  public DispenserXXXDollarBill(DispenseChain nextInChain, int currencyNotes) {
    this.dispenseChain = nextInChain;
    this.CURRENCY_NOTES = currencyNotes;
  }

  @Override
  public void dispenseCash(Currency cur) {
    dispenserHelper(cur, CURRENCY_NOTES, dispenseChain);
  }
}
