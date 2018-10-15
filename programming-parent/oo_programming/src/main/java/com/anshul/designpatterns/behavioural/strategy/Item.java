package com.anshul.designpatterns.behavioural.strategy;

public class Item {
  private String name;
  private String type;
  private int id;
  private String category;
  private double price;

  public Item(String name, String type, int id, String category, double price) {
    this.name = name;
    this.type = type;
    this.id = id;
    this.category = category;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  @Override
  public String toString() {
    return "Item{" +
        "name='" + name + '\'' +
        ", type='" + type + '\'' +
        ", id=" + id +
        ", category='" + category + '\'' +
        '}';
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }
}
