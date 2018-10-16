package com.anshul.designpatterns.behavioural.chain_of_responsibility.atm_machine;

public class EntryPointChainOfCommand {
  public static void main(String[] args) {

    Currency currency = new Currency(130);

    DispenserXXXDollarBill dispenser20DollarBill = new DispenserXXXDollarBill(null, 20);
    DispenserXXXDollarBill dispenser50DollarBil = new DispenserXXXDollarBill(dispenser20DollarBill, 50);
    DispenserXXXDollarBill dispenser100DollarBill = new DispenserXXXDollarBill(dispenser50DollarBil, 100);


    dispenser100DollarBill.dispenseCash(new Currency(80));

  }
}
