package com.anshul.designpatterns.creational.abstractfactory;

public class Server implements Computer {

  private int ram;
  private String processor;
  private int hdd;
  private String model;

  public Server(int ram, String processor, int hdd, String model) {
    this.ram = ram;
    this.processor = processor;
    this.hdd = hdd;
    this.model = model;
  }

  @Override
  public String getModel() {
    return model;
  }

  @Override
  public String toString() {
    return "Server{" +
        "ram=" + ram +
        ", processor='" + processor + '\'' +
        ", hdd=" + hdd +
        '}';
  }

  @Override
  public String getConfigurations() {
    return toString();
  }
}
