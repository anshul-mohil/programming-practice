package com.anshul.designpatterns.behavioural.strategy;

@FunctionalInterface
interface PaymentStratergy {
  boolean pay(Double amount);
}
