package com.anshul.designpatterns.behavioural.strategy;

public class PayPal implements PaymentStratergy {
  @Override
  public boolean pay(Double amount) {

    //some logic to intract to paypal gateway
    System.out.println(" amount " + amount + " paid vai paypal");
    return true;
  }
}
