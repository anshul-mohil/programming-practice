package com.anshul.designpatterns.behavioural.strategy;

public class CreditCard implements PaymentStratergy {
  @Override
  public boolean pay(Double amount) {

    //some logic for credit card payment
    System.out.println("Amount paid " + amount + " vai credit card");
    return true;
  }
}
