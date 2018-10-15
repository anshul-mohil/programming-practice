package com.anshul.designpatterns.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
  private final List<Item> itemList;

  public Cart(List<Item> itemList) {
    this.itemList = itemList;
  }

  public List<Item> getItemList() {
    return new ArrayList<>(itemList);
  }

  public void add(Item... items) {
    for (Item item : items) {
      itemList.add(item);
    }
  }

  public void removeItem(Item... items) {
    for (Item item : items) {
      itemList.remove(item);
    }
  }


  public Double makePayment(PaymentStratergy paymentStratergy) {
    Double totalPaymentRequired = calculateAmount();
    paymentStratergy.pay(totalPaymentRequired);
    return totalPaymentRequired;
  }

  private Double calculateAmount() {
    Double sum = 0D;
    for (Item item : itemList) {
      sum += item.getPrice();
    }
    return sum;
  }

}
