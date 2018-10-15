package com.anshul.designpatterns.behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class EntryPointStragergy {
  public static void main(String[] args) {

    CreditCard creditCard = new CreditCard();

    List<Item> itemList = new ArrayList<>();
    itemList.add(new Item("pen", "pen", 1, " Pen", 20.0D));
    itemList.add(new Item("pencil", "pencil", 1, " Pencil", 10.0D));
    Cart cart = new Cart(itemList);

    System.out.println("total payment given " + cart.makePayment(new PayPal()));
  }
}
